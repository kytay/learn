package com.merlionlab.app.domain;

import java.time.DayOfWeek;

import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

@PlanningEntity
public class ShiftVO {
	
	private String shiftId;

	private String startTime;
	
	private String endTime;
	
	private DayOfWeek dayOfWeek;
	
	private ShiftDayVO assignedShiftDay;

	public String getShiftId() {
		return shiftId;
	}

	public void setShiftId(String shiftId) {
		this.shiftId = shiftId;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	@PlanningVariable(valueRangeProviderRefs = {})
	public ShiftDayVO getAssignedShiftDay() {
		return assignedShiftDay;
	}

	public void setAssignedShiftDay(ShiftDayVO assignedShiftDay) {
		this.assignedShiftDay = assignedShiftDay;
	}
}
