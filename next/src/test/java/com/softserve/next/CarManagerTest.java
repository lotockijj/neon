package com.softserve.next;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class CarManagerTest {

	@Test
	public void testSerializeCar() {
		CarManager manager = new CarManager();
		
		Car car = new Car(60, 12);
		Car trailer = new Trailer(80, 22, 12);
		Car roadTrain = new RoadTrain(70, 26, 40);
		List<Car> cars = new ArrayList<>();
		cars.add(car);
		cars.add(trailer);
		cars.add(roadTrain);
		manager.serializeCar(cars);
		List<Car> list = manager.deSerializeCar();
		Assert.assertEquals(3, list.size());
		Car carMaxSp = manager.getCarWithMaxSpeed(list);
		Assert.assertEquals(80, carMaxSp.getPermissibleSpeed());
		Car carMinR = manager.getCarWithMinimumRadius(list);
		Assert.assertEquals(12, carMinR.getMinRadius());
	}

}
