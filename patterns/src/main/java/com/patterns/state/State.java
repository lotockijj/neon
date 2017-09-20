package com.patterns.state;

public class State {
	private MemberAccount context;

	public static State initializeState(MemberAccount memberAccount) {
		return new Active(memberAccount);
	}
	
	public State transitionState(){
		return null;
	}
	
	public void setContext(MemberAccount cont){
		context = cont;
	}
	
	public MemberAccount getContext(){
		return context;
	}
	
	public State(MemberAccount account){
		setContext(account);
	}
	
	public State(State source){
		setContext(source.getContext());
	}

	public boolean isAllowed() {
		return true;
	}
	
}
