package javaProgram;

import org.junit.Assert;
import org.junit.Test;

public class Palindrome {
	
	/*
	Given an integer x, return true if x is a palindrome, and false otherwise.
	Input: x = 121
	Output: true
	Explanation: 121 reads as 121 from left to right and from right to left.
	*/
	
	public boolean isPalindrome(int num) {
		int out= 0, originalNum = num;
		while(num!=0) {
			out = out*10+num%10;
			num /= 10;
		}
		if(originalNum == out) return true;
		else return false;
	}
	
	@Test
	public void positiveInput() {
		boolean actual =isPalindrome(101);
		Assert.assertEquals(true, actual);
	}
	@Test
	public void positiveInput1() {
		boolean actual =isPalindrome(99);
		Assert.assertEquals(true, actual);
	}
	@Test
	public void negativeInput() {
		boolean actual =isPalindrome(-101);
		Assert.assertEquals(true, actual);
	}
	@Test
	public void edgeInput() {
		boolean actual =isPalindrome(-1010);
		Assert.assertEquals(false, actual);
	}
	@Test
	public void edgeInput1() {
		boolean actual =isPalindrome(1);
		Assert.assertEquals(true, actual);
	}

}
