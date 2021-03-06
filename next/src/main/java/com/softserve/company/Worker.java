package com.softserve.company;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** Create classes Employee and Manager with methods which return the general working 
 * experience and payment for work done. Give your suggestions about relations
 * between classes(is-a, has-a, use-a, etc). Find solution for avoiding of duplicate 
 * code. Write well commented code with examples of using these classes. 
 * Write code for reading and writing collection of these objects from (into) file.
 * Find employee with maximal working experience.
 * Find employee with maximal payment.
 * Write code for handling the incorrect format of incoming file.
 */

public abstract class Worker implements Serializable{
	private static final long serialVersionUID = -1559774790790947546L;
	private Date startDate;
	private BigDecimal rate;
	
	public Worker(Date startDate, BigDecimal rate) {
		this.startDate = startDate;
		this.rate = rate;
	}
	

	@SuppressWarnings("deprecation")
	public int getGeneralExperience(){
		int exp = 0;
		Date now = new Date();
		if(startDate != null){
			exp = now.getYear() - startDate.getYear();
		}
		return exp;
	}
	
	public BigDecimal getPayment(){
		BigDecimal payment = new BigDecimal(5);
		payment = payment.multiply(rate);
		return payment;
	}

}
