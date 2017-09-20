package com.patterns.state;

public class Due extends State {

	public Due(MemberAccount account) {
		super(account);
	}

	public Due(State source){
		super(source);
	}

	public boolean isAllowed(){
		int currentDate = DateHelper.getDayOfMonth(getContext().getDate());
		if(!(getContext().isPaid()) &&
				currentDate > 5 && 
				currentDate  < 10){
			return true;
		}
		return false;
	}

}
