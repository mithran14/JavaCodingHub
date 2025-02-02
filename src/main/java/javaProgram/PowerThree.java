package javaProgram;

import org.junit.Assert;
import org.junit.Test;

public class PowerThree {
	
	/*
	 * https://leetcode.com/problems/power-of-three/
	Given an integer n, return true if it is a power of three. Otherwise, return false.

	An integer n is a power of three, if there exists an integer x such that n == 3x.

	Example 1:

	Input: n = 27
	Output: true
	Explanation: 2 POWER 7 = 33
	Example 2:

	Input: n = 0
	Output: false
	Explanation: There is no x where 3x = 0.
	*/
	
	public boolean isPowerThree(int n) {
		if(n==0) {
			return false;
		}
		int i = 1;
		while(i<n)
		{
			int temp= (int) (Math.pow(3, i++));
			if(n == temp){
				return true;
			}
			if (temp>n)
			{
				break;
			}
		}
		return false;
	}
	
	@Test
	public void positiveInput() {
		boolean actual =isPowerThree(27);
		Assert.assertEquals(true, actual);
	}
	@Test
	public void negativeInput() {
		boolean actual =isPowerThree(33);
		Assert.assertEquals(false, actual);
	}
	@Test
	public void edgeInput() {
		boolean actual = isPowerThree(99);
		Assert.assertEquals(false, actual);
	}
}
