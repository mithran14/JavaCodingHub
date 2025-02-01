package javaProgram;

import org.junit.*;

public class AddDigits {

	/*
	https://leetcode.com/problems/add-digits/description/ 
	Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

	Example 1:

	Input: num = 38
	Output: 2
	Explanation: The process is
	38 --> 3 + 8 --> 11
	11 --> 1 + 1 --> 2 
	Since 2 has only one digit, return it.
	Example 2:

	Input: num = 0
	Output: 0

	 */

	public int addSum(int n) {

		while(n>9) {
			int sum=n%10;
			n/=10;
			n=n+sum;
		}
		return n;
	}

	
	@Test
	public void positiveInput() {
		int actual = addSum(38);
		Assert.assertEquals(actual, 2);
	}
	@Test
	public void negativInput() {
		int actual = addSum(1999);
		Assert.assertEquals(actual, 1);
	}
	@Test
	public void edgeInput() {
		int actual = addSum(199);
		Assert.assertEquals(actual, 1);
	}
}
