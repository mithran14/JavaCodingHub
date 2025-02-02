package javaProgram;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class IntegratedArrayHowMany {

	/*
	4. Given an integer array arr, count how many elements x there are, 
   such that x + 1 is also in arr. 
   If there are duplicates in arr, count them separately.

   example 1: input = [1, 2, 3]
			  output = 2
			explanation: when x is 1, we see x+1 (2) is present in input
						 when x is 2, we see x+1 (3) is present in input
						 when x is 3, we see x+1 (4) is not present in input
						so no of presence of x+1 is 2
   example 2: input = [1, 1, 3, 3, 5, 5, 7, 7]
			  output = 0
			  explanation: no occurence of x+1 for x

   example 3: input = [1, 1, 2]
			  output = 2
			  explanation: when x is 1, we see x+1 (2) is present in input
						   when x is 1, we see x+1 (2) is present in input
						   when x is 2, we see x+1 (3) is not present in input

	 */

	public int arrayHowMany(int[] arr) {
		int count =0;
		;
		for (int j= 0; j < arr.length; j++) {
			int target=(arr[j]+1);
			if (Arrays.stream(arr).anyMatch(x -> x == target)) {
				count++;
			}
		}
		return count;
	}
	@Test
	public void positiveInput() {
		int actual =arrayHowMany(new int[] {0,1,0,2,3});
		Assert.assertEquals(4, actual);
	}
	@Test
	public void negativeInput() {
		int actual =arrayHowMany(new int[] {-2,-1,0,2,3});
		Assert.assertEquals(3, actual);
	}
	@Test
	public void negativeInput1() {
		int actual =arrayHowMany(new int[] {-2,-1,-3,1,0,2,3});
		Assert.assertEquals(6, actual);
	}
	@Test
	public void edgeInput() {
		int actual =arrayHowMany(new int[] {1,4,7});
		Assert.assertEquals(0, actual);
	}
	@Test
	public void edgeInput1() {
		int actual =arrayHowMany(new int[] {1});
		Assert.assertEquals(0, actual);
	}
}
