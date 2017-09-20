package com.patterns.state;

import java.util.Date;

public class MemberAccount {
	private int id;
	private String name;
	private State state;
	private boolean isPaid;
	private Date date;
	
	public MemberAccount(int id, String name){
		this.id = id;
		this.name = name;
		state = State.initializeState(this);
	}
	
	public boolean isAllowed(){
		return state.isAllowed();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
