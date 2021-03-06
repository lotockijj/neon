package com.patterns.state;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import junit.framework.Assert;

public class MemberAccountTest {

	@Test
	public void testIsAllowed() throws ParseException {
		MemberAccount account = new MemberAccount(1, "Roman");
		account.setDate(new Date());
		account.setPaid(true);
		State active = new Active(account.getState());
		Assert.assertTrue(active.isAllowed());
		account.setPaid(false);
		Assert.assertFalse(active.isAllowed());
		State due = new Due(account.getState());
		Assert.assertFalse(due.isAllowed());
		//day between 5 and 10
		account.setDate(new SimpleDateFormat("dd-mm-yyyy").parse("06-10-2017"));
		Assert.assertTrue(due.isAllowed());
		account.setPaid(false);
		Assert.assertTrue(due.isAllowed());
	}

}
