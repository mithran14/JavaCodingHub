package javaProgram;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SquareOfSortedArray {
	
	/*	
	 * https://leetcode.com/problems/squares-of-a-sorted-array/
		Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

		Example 1:

		Input: nums = [-4,-1,0,3,10]
		Output: [0,1,9,16,100]
		Explanation: After squaring, the array becomes [16,1,0,9,100].
		After sorting, it becomes [0,1,9,16,100].
		*/
	
	public int[] squaresOfSortedArray(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr[i]*arr[i];
		}
		Arrays.sort(arr);
		return arr;
	}
	
	@Test
	public void positiveInput() {
		int[] actual =squaresOfSortedArray(new int[] {-4,-1,0,3,10});
		int[] expected = {0,1,9,16, 100};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void negativeInput() {
		int[] actual =squaresOfSortedArray(new int[] {-7,-3,2,3,11});
		int[] expected = {4,9,9,49,121};
		Assert.assertArrayEquals(expected, actual);
	}

}
