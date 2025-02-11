package javaProgram;

import org.junit.Assert;
import org.junit.Test;

public class ShuffleString {
			
	/*

	 https://leetcode.com/problems/shuffle-string/description/
	 
	Shuffle String

	You are given a string s and an integer array indices of the same length. 
	The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

	Return the shuffled string.


	 */

	public String shuffle_String(String S, int[] num)
	{
		char[] out = new char[num.length];
		String a= "";
		
		for (int i = 0; i < num.length; i++) {
			out[num[i]] = S.charAt(i);
		}
		for (char i : out) {
			a+=i;
		}
		
		return a;
	}
	
	@Test
	public void shuffle_StringPositive()
	{
		String actual=shuffle_String("codeleet",new int[] {4,5,6,7,0,2,1,3});
		 String expected ="leetcode";
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void shuffle_StringPositive1()
	{
		String actual=shuffle_String("abc",new int[] {0,1,2});
		 String expected ="abc";
		Assert.assertEquals(expected, actual);
	}
	
}
