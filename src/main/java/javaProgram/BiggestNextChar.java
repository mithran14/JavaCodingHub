package javaProgram;

import org.junit.Assert;
import org.junit.Test;

public class BiggestNextChar {
	
	/*
	 * 1. Given a sorted/unsorted character array and a target character, 
		find the next biggest character in the array. 

		Example:
		char[] arr = {‘b’, ‘d’ , ‘h’}; char k = ‘e’ 
		Output -> h
	 */
	
	public char nextBigChar(char[] arr, char a) {
		
		for (char c : arr) {
			if(c>a) {
				return c;
			}
		}
		return a;
	}
	
	@Test
	public void positiveInput() {
		char actual =nextBigChar(new char[] {'b','d','h'}, 'e');
		Assert.assertEquals(actual, 'h');
	}
	@Test
	public void negativeInput() {
		char actual =nextBigChar(new char[] {'z','a'}, 'y');
		Assert.assertEquals(actual, 'z');
	}
	@Test
	public void edgeInput() {
		char actual =nextBigChar(new char[] {'z','a'}, 'z');
		Assert.assertEquals(actual, 'z');
	}
	@Test
	public void edgeInput1() {
		char actual =nextBigChar(new char[] {'a','b'}, 'z');
		Assert.assertEquals(actual, 'z');
	}

}
