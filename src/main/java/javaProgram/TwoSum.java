package javaProgram;

import org.junit.Assert;
import org.junit.Test;

public class TwoSum {

	/*
	https://leetcode.com/problems/two-sum/description/
	Given an array of integers nums and an integer target, 
	return indices of the two numbers such that they add up to target.

	You may assume that each input would have exactly one solution, 
	and you may not use the same element twice.
	You can return the answer in any order.
	Example 1:

	Input: nums = [2,7,11,15], target = 9
	Output: [0,1]
	Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

	Example 2:

	Input: nums = [3,2,4], target = 6
	Output: [1,2]
	Example 3:

	Input: nums = [3,3], target = 6
	Output: [0,1]  */

	public int[] twosum(int[] arr, int target) {
		int[] out= new int[]{-1,-1};
		boolean isFind= false;
		for (int i = 0; i < arr.length; i++) {
			if(isFind ==false) { 
				for (int j = i+1; j < arr.length; j++) {
					if (arr[i]+arr[j] == target) {
						out[0] = i;
						out[1] = j;
						isFind =true;
					}
				}
			}
		}
		return out;
	}

	@Test
	public void positiveInput() {
		int[] actual =twosum(new int[] {-2,7,2,0,9},9);
		int[] expected = {1,2};
		Assert.assertArrayEquals(actual, expected);
	}
	@Test
	public void negativeInput() {
		int[] actual =twosum(new int[] {-2,6,2,-6},-4);
		int[] expected = {2,3};
		Assert.assertArrayEquals(actual, expected);
	}
	@Test
	public void edgeInput() {
		int[] actual =twosum(new int[] {3,3},6);
		int[] expected = {0,1};
		Assert.assertArrayEquals(actual, expected);
	}
	@Test
	public void edgeInput1() {
		int[] actual =twosum(new int[] {3,3},7);
		int[] expected = {-1,-1};
		Assert.assertArrayEquals(actual, expected);
	}
}
