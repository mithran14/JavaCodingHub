package javaProgram;

import org.junit.Assert;
import org.junit.Test;

public class Next_Greater_Element_NGE {
	
		/*  
		    Input: arr[] = [1, 3, 2, 4]
			Output: [3, 4, 4, -1]
			Explanation: The next larger element to 1 is 3, 3 is 4, 2 is 4 and for 4, since it doesn’t exist, it is -1.


			Input: arr[] = [6, 8, 0, 1, 3]
			Output: [8, -1, 1, 3, -1]
			Explanation: The next larger element to 6 is 8, for 8 there is no larger elements hence it is -1, for 0 it is 1 , for 1 it is 3 and then for 3 there is no larger element on right and hence -1.


			Input: arr[] = [10, 20, 30, 50]
			Output: [20, 30, 50, -1]
			Explanation: For a sorted array, the next element is next greater element also exxept for the last element.


			Input: arr[] = [50, 40, 30, 10]
			Output: [-1, -1, -1, -1]
			Explanation: There is no greater element for any of the elements in the array, so all are -1.
		*/

	public int[] nge(int arr[]) {
		
		int[] output =new int[arr.length];
		for (int i = 0; i < output.length; i++) {
			output[i] = -1;
			for (int j = i+1; j < output.length; j++) {
				if (arr[j] > arr[i]) {
					output[i] = arr[j];
					break;
				}
			}
		}
		return output;
	}
	
	@Test
	public void positiveInput()  {
		int[] actual = nge(new int[] {1, 3, 2, 4});
		int[] expected = (new int[] {3, 4, 4, -1});
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void negativeInput()  {
		int[] actual = nge(new int[] {6, 8, 0, 1, 3});
		int[] expected = (new int[] {8, -1, 1, 3, -1});
		Assert.assertArrayEquals(expected, actual);
		
	}
	@Test
	public void edgeInput()  {
		int[] actual = nge(new int[] {50, 40, 30, 10});
		int[] expected = (new int[] {-1, -1, -1, -1});
		Assert.assertArrayEquals(expected, actual);
		
	}
}
