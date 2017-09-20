package com.patterns.state;

public class Active extends State {

	public Active(MemberAccount account) {
		super(account);
	}

	public Active(State source){
		super(source);
	}

	public boolean isAllowed(){
		if(getContext().isPaid()){
			return true;
		} else {
			return false;
		}
	}

}
