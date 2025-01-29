package javaProgram;

import org.junit.Assert;
import org.junit.Test;

public class PowerTwo {
	/*
	https://leetcode.com/problems/power-of-two/description/
	Given an integer n, return true if it is a power of two. Otherwise, return false.

	An integer n is a power of two, if there exists an integer x such that n == 2x.

	Input: n = 1
	Output: true
	Explanation: 2 POWER 0 = 1

	Input: n = 16
	Output: true
	Explanation: 2 POWER 4 = 16
	*/
	
	public boolean isPower(int n) {
		int a=0;
		while(Math.pow(2, a)<=n) {
			if(n == Math.pow(2, a++)) return true;
		}
		return false;
	}
	
	@Test
	public void positiveInput() {
		boolean actual =isPower(64);
		Assert.assertEquals(actual, true);
	}
	@Test
	public void negativeInput() {
		boolean actual =isPower(-32);
		Assert.assertEquals(actual, false);
	}
	@Test
	public void edgeInput() {
		boolean actual =isPower(10);
		Assert.assertEquals(actual, false);
	}

}
