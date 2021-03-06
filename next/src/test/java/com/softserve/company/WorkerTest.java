package com.softserve.company;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class WorkerTest {
	private Accountant accountant;
	private Employee employee;
	private Manager manager;
	private List<Worker> workers;

	@Before
	public void setUp() throws Exception {
		accountant = new Accountant();

		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date inputDate = dateFormat.parse("11-11-2012");

		employee = new Employee(inputDate, new BigDecimal(100));

		Date inputDate2 = dateFormat.parse("01-01-2006");
		manager = new Manager(inputDate2, new BigDecimal(200));

		workers = new ArrayList<>();
		workers.add(employee);
		workers.add(manager);

		accountant.serializeWorker(workers);
	}

	@Test
	public void testGetGeneralExperience() {
		Worker worker = accountant.getWorkersWithMaxExperience(workers);
		Assert.assertEquals(11, worker.getGeneralExperience());
	}

	@Test
	public void testGetPayment() {
		Worker worker = accountant.getWorkerWithMaxPayment(workers);
		Assert.assertTrue(new BigDecimal(1000).compareTo(worker.getPayment()) == 0);
	}

}
