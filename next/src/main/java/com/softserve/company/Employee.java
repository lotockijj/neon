package com.softserve.company;

import java.math.BigDecimal;
import java.util.Date;

public class Employee extends Worker {
	private static final long serialVersionUID = -7730874425991217382L;

	public Employee(Date startDate, BigDecimal rate) {
		super(startDate, rate);
	}

}
