package javaProgram;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class MajorityElement {
	
	/*
	https://leetcode.com/problems/majority-element/description/
	Given an array nums of size n, return the majority element.

	The majority element is the element that appears more than ⌊n / 2⌋ times. 
	You may assume that the majority element always exists in the array.

	Example 1:

	Input: nums = [3,2,3]
	Output: 3

	Example 2:

	Input: nums = [2,2,1,1,1,2,2]
	Output: 2
	*/
	
	public int majorityElement(int[] arr) {
		int n=arr.length/2;
		int out = 0;
		Map<Integer,Integer> map=new HashMap<>();
		
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
			if (entry.getValue()>=n) {
				out= entry.getKey();
			}
		}
		return out;
	}
	
	@Test
	public void positiveInput() {
		int actual =majorityElement(new int[] {1, 1, 2, 2, 2, 2, 3});
		int expected = 2;
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void negativeInput() {
		int actual =majorityElement(new int[] {1,1,2,2,-1,1});
		int expected = 1;
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void edgeInput() {
		int actual =majorityElement(new int[] {0,0,0});
		int expected = 0;
		Assert.assertEquals(actual, expected);
	}

}
