package com.patterns.objectauthenticator;

import org.junit.Test;

import junit.framework.Assert;

public class EmployeeManagerTest {

	@Test
	public void testGetData() throws Exception {
		EmployeeManager manager = new EmployeeManager();
		Assert.assertEquals("Departmen: first. Kind: worker.", manager.getData("first", "worker"));
	}

}
