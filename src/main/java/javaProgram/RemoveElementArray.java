package javaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class RemoveElementArray {

	/*
	Remove the target element in the array

	example 1: input = [2, 3, 3, 4, 5], target=3
			   output = [2, 4, 5]
			   explanation: when 3 is removed from input array, 
							output is [2, 4, 5]
	 */

	public Integer[] removeEle(Integer[] num, int target) {
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(num));
		Iterator<Integer> iterator = list.iterator();

			while (iterator.hasNext()) {
				if (iterator.next() == target) {
					iterator.remove();
				}
			}
			return list.toArray(new Integer[0]);
		
	}

	@Test
	public void positiveInput() {
		Integer[] actual =removeEle(new Integer[] {2,3,3,4,5},3);
		Integer[] expected = {2,4,5};
		Assert.assertArrayEquals(actual, expected);
	}
	@Test
	public void negativeInput() {
		Integer[] actual =removeEle(new Integer[] {2,-3,3,4,5},-3);
		Integer[] expected = {2,3,4,5};
		Assert.assertArrayEquals(actual, expected);
	}
	@Test
	public void edgeInput() {
		Integer[] actual =removeEle(new Integer[] {2,3,3,4,5},0);
		Integer[] expected = {2,3,3,4,5};
		Assert.assertArrayEquals(actual, expected);
	}

}
