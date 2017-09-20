package com.patterns.state;

import java.util.Calendar;
import java.util.Date;

public class DateHelper {
	
	public static int getDayOfMonth(Date aDate) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(aDate);
		return cal.get(Calendar.DAY_OF_MONTH);
	}

}
