package javaProgram;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeros {

	/*
	https://leetcode.com/problems/move-zeroes/description/
	Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

	Note that you must do this in-place without making a copy of the array.

	Example 1:

	Input: nums = [0,1,0,3,12]
	Output: [1,3,12,0,0]
	Example 2:

	Input: nums = [0]
	Output: [0]

	 */

	public int[] moveZero(int[] arr) {

		int i =0,j =0;
		while(i< arr.length && j<arr.length) {
			if(arr[i] ==0 && arr[j]==0) {
				j++;
			}
			else if (arr[i] ==0 && arr[j]!=0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
			else {
				i++;
				j++;
			}

		}
		return arr;
	}


	@Test
	public void positiveInput() {
		int[] actual =moveZero(new int[] {0,1,0,3,12});
		int[] expected = {1,3,12,0,0};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void negativeInput() {
		int[] actual =moveZero(new int[] {-4,0,9,0,10,11});
		int[] expected = {-4,9,10,11,0,0};
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void edgeInput() {
		int[] actual =moveZero(new int[] {0});
		int[] expected = {0};
		Assert.assertArrayEquals(expected, actual);
	}
}
