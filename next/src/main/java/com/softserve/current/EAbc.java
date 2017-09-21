package com.softserve.current;

public class EAbc extends Abc {
	private int id;
	private String name;
	
	public EAbc(int id, String name) {
		this.id = id;
		this.name = name;
	}

	
	
	public static void main(String[] args) {
		int i = 1;
		int s = 1;
		while(i-- > 0){
			s += i;
		}
		System.out.println(s++);
				
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
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

}