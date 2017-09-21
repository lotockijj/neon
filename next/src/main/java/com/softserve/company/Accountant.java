package com.softserve.company;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Accountant {
	
	public void serializeWorker(List<Worker> workers){
		try(ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("workers.txt"))){
			for (int i = 0; i < workers.size(); i++) {
				oos.writeObject(workers.get(i));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<Worker> deSerializeWorkers(){
		List<Worker> workers = new ArrayList<>();
		try(ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("workers.txt"))){
			Worker worker = null;
			do {
				worker = (Worker) ois.readObject();
				if(worker != null){
					workers.add(worker);
				} 
			} while (worker != null); 
		} catch (EOFException e){
			System.out.println(e);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return workers;
	}

	public Worker getWorkersWithMaxExperience(List<Worker> workers){
		Worker worker = workers.get(0);
		for (int i = 1; i < workers.size(); i++) {
			if(worker.getGeneralExperience() < workers.get(i).getGeneralExperience()){
				worker = workers.get(i);
			}
		}
		return worker;
	}
	
	public Worker getWorkerWithMaxPayment(List<Worker> workers){
		Worker worker = workers.get(0);
		for (int i = 1; i < workers.size(); i++) {
			if(worker.getPayment().compareTo( workers.get(i).getPayment()) < 0){
				worker = workers.get(i);
			}
		}
		return worker;
	}
}
