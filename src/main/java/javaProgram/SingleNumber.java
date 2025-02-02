package javaProgram;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

public class SingleNumber {

	/*
	https://leetcode.com/problems/single-number/description/
	Given a non-empty array of integers nums, every element appears twice except for one. 
	Find that single one.

	You must implement a solution with a linear runtime complexity and use only constant extra space.

	Example 1:

	Input: nums = [2,2,1]
	Output: 1
	Example 2:

	Input: nums = [4,1,2,1,2]
	Output: 4
	 */

	public int singleNumber(int[] arr) {

		Map<Integer,Integer> num = new HashMap<Integer,Integer>();
		int a=0;
		for (int i : arr) {
			num.put(i, num.getOrDefault(i, 0)+1);
		}

		for (Map.Entry<Integer,Integer> entry : num.entrySet()) {
			if(entry.getValue()==1) {
				a=entry.getKey();
				break;
			}
		}

		return a;


	}

	@Test
	public void positiveInput() {
		int actual = singleNumber(new int[] {2,2,1} );
		Assert.assertEquals(actual, 1);
	}
	@Test
	public void negativInput() {
		int actual = singleNumber(new int[] {-4,1,4,1,4});
		Assert.assertEquals(actual, -4);
	}
	@Test
	public void edgeInput() {
		int actual = singleNumber(new int[] {1});
		Assert.assertEquals(actual, 1);
	}
}
