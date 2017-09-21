package com.softserve.company;

import java.math.BigDecimal;
import java.util.Date;

public class Manager extends Worker {
	private static final long serialVersionUID = 6700221330442785672L;

	public Manager(Date startDate, BigDecimal rate) {
		super(startDate, rate);
	}

}
