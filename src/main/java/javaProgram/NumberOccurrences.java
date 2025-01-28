package javaProgram;

import org.junit.Assert;
import org.junit.Test;


public class NumberOccurrences {

	/*Examples:

		Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 2
		Output: 4
		Explanation: 2 occurs 4 times in the given array.


		Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 4
		Output: 0
		Explanation: 4 is not present in the given array.
	*/
		
	public int findOccurrence(int[] arr, int target) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				count++;
			}
		}
		return count;
	}


	@Test
	public void positiveInput() {
		int actual =findOccurrence(new int[] {1, 1, 2, 2, 2, 2, 3}, 2);
		int expected = 4;
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void negativeInput() {
		int actual =findOccurrence(new int[] {0}, 0);
		int expected = 1;
		Assert.assertEquals(actual, expected);
	}
	@Test
	public void edgeInput() {
		int actual =findOccurrence(new int[] {1},5);
		int expected = 0;
		Assert.assertEquals(actual, expected);
	}
}
