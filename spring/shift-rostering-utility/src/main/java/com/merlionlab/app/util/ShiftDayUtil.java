package com.merlionlab.app.util;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

import com.merlionlab.app.domain.ShiftDayVO;

public class ShiftDayUtil {

	public static List<ShiftDayVO> getListOfShiftDays(int byWeekNum) {
		
		if(byWeekNum > 0)
		{
			List<ShiftDayVO> shiftDayList = new ArrayList<ShiftDayVO>();
			int index = 0;
			
			for(int weekItr = 0; weekItr < byWeekNum; weekItr++)
			{
				index++;
				
				for(int dayItr = 0; dayItr < DayOfWeek.values().length; dayItr++)
				{
					ShiftDayVO shiftDay = new ShiftDayVO();
					shiftDay.setDayIndex(index);
					shiftDay.setDayOfWeek(DayOfWeek.of(dayItr + 1));
					shiftDay.setWeekNum(weekItr + 1);
					shiftDayList.add(shiftDay);
				}
			}
			
			return shiftDayList;
		}
		
		return null;
	}
}
