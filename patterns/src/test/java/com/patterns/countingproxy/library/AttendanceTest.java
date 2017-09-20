package com.patterns.countingproxy.library;

import org.junit.Test;

import junit.framework.Assert;

public class AttendanceTest {

	@Test
	public void test() {
		Attendance magazine = new Magazine();
		Attendance book = new Book();
		Attendance video = new Video();
		Attendance dvd = new Dvd();
		Attendance[] items = new Attendance[4];
		items[0] = magazine;
		items[1] = book;
		items[2] = video;
		items[3] = dvd;
		
		Attendance library = new Library(items);
		magazine.checked();
		Assert.assertEquals(1, library.getNumberCheckedItems());
		book.checked();
		video.checked();
		Assert.assertEquals(3, library.getNumberCheckedItems());
		dvd.checked();
		Assert.assertEquals(4, library.getNumberCheckedItems());
		for (int i = 0; i < items.length; i++) {
			items[i].checked();
		}
		Assert.assertEquals(8, library.getNumberCheckedItems());
		
		
		
	}

}
