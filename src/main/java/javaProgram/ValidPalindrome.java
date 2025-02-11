package javaProgram;

import org.junit.Assert;
import org.junit.Test;

public class ValidPalindrome {
	
	/*
	 https://leetcode.com/problems/valid-palindrome/description/
	 
	Valid Palindrome

	A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

	Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

	Input: s = "A man, a plan, a canal: Panama"
	Output: true
	Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

	Input: s = "race a car"
	Output: false
	Explanation: "raceacar" is not a palindrome.
Example 3:

	Input: s = " "
	Output: true
	Explanation: s is an empty string "" after removing non-alphanumeric characters.
	Since an empty string reads the same forward and backward, it is a palindrome.
	*/
	
	
	public boolean valid_palindrome(String input) {
		
		input = input.toLowerCase().replaceAll("[^a-zA-Z]", "");
		int i=0, j=input.length()-1;
		while(i<j) {
			if(input.charAt(i) != input.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	@Test
	public void valid_palindromePositive()
	{
		boolean actual=valid_palindrome("A man, a plan, a canal: Panama");
		boolean expected =true;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void valid_palindromePositive1()
	{
		boolean actual=valid_palindrome("Ma d Am");
		boolean expected =true;
		Assert.assertEquals(expected, actual);
	}


}
