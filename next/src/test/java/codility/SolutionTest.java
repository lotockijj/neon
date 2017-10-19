package codility;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class SolutionTest {
	private Solution solution;
	
	@Before
	public void setUp() throws Exception {
		solution = new Solution();
	}

	@Test
	public void testSolution() {
		int[] arr = {1, 3, 6, 4, 1, 2};
		Assert.assertEquals(5, solution.compute(arr));
		int[] arr2 = {1, 2, 3};
		Assert.assertEquals(4, solution.compute(arr2));
		int[] arr3 = {-1, -3};
		Assert.assertEquals(1, solution.compute(arr3));
		int[] arr4 = {1, 2, 3, 6, 4, 5};
		Assert.assertEquals(7, solution.compute(arr4));
		Random r = new Random();
		String str = r.nextBoolean() ? "Eagl" : "Coat of arms";
		System.out.println(str);
		int a = 0xffff;
		System.out.println(Integer.toBinaryString(a));
		long l = 0xfff;
		System.out.println(Long.toBinaryString(l));
		int n = 200;
		long lng = n;
		System.out.println(lng);
		n = (int) lng;
		System.out.println("______________________---");
		String str2 = "Hello";
		String str3 = "Hello";
		System.out.println("= " + (str2 == str3));
		System.out.println("!= " + (str2 != str3));
		System.out.println("equals: " + (str2.equals(str3)));
	}

}