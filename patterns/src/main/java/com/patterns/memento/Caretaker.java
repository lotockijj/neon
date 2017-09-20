package com.patterns.memento;

import java.util.ArrayList;

public class Caretaker {
	private ArrayList<Memento> mementoes = new ArrayList<>();
	
	public void addMemento(Memento m){
		mementoes.add(m);
	}
	
	public Memento getMemento(){
		return mementoes.get(1);
	}
}
