package com.softserve.next;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CarManager {

	public void serializeCar(List<Car> cars){
		try(ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("cars.txt"))){
			for (int i = 0; i < cars.size(); i++) {
				oos.writeObject(cars.get(i));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<Car> deSerializeCar(){
		List<Car> cars = new ArrayList<>();
		try(ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("cars.txt"))){
			Car car = null;
			do {
				car = (Car) ois.readObject();
				if(car != null){
					cars.add(car);
				} 
			} while (car != null); 
		} catch (EOFException e){
			System.out.println(e);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return cars;
	}

	public Car getCarWithMaxSpeed(List<Car> cars){
		Car car = cars.get(0);
		for (int i = 1; i < cars.size(); i++) {
			if(car.getPermissibleSpeed() < cars.get(i).getPermissibleSpeed()){
				car = cars.get(i);
			}
		}
		return car;
	}
	
	public Car getCarWithMinimumRadius(List<Car> cars){
		Car car = cars.get(0);
		for (int i = 1; i < cars.size(); i++) {
			if(car.getMinRadius() > cars.get(i).getMinRadius()){
				car = cars.get(i);
			}
		}
		return car;
	}
	
}
