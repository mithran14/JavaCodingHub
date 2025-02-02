package javaProgram;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class DistributeCandy {
	/*https://leetcode.com/problems/distribute-candies/submissions/
	Distribute Candies

	Alice has n candies, where the ith candy is of type candyType[i]. 
	Alice noticed that she started to gain weight, so she visited a doctor.

	The doctor advised Alice to only eat n / 2 of the candies she has (n is always even).
	 Alice likes her candies very much, and she wants to eat the maximum 
	 number of different types of candies while still following the doctor's advice.

	Given the integer array candyType of length n, 
	return the maximum number of different types of candies she can eat 
	if she only eats n / 2 of them.

	Example 1:

	Input: candyType = [1,1,2,2,3,3]
	Output: 3
	Explanation: Alice can only eat 6 / 2 = 3 candies. 
	Since there are only 3 types, she can eat one of each type.

	Example 2:

	Input: candyType = [1,1,2,3]
	Output: 2
	Explanation: Alice can only eat 4 / 2 = 2 candies. 
	Whether she eats types [1,2], [1,3], or [2,3], she still can only eat 2 different types.

	Example 3:

	Input: candyType = [6,6,6,6]
	Output: 1
	Explanation: Alice can only eat 4 / 2 = 2 candies. 
	Even though she can eat 2 candies, she only has 1 type.
	
	*/
	
	public int distributeCandy(int[] num)
	{
		if(num.length==1) return 1;
		Set<Integer> set =new HashSet<>();
		for (int i : num) {
			set.add(i);
		}
		
		return Math.min(set.size(), (num.length)/2);
		
	}
	
	@Test
	public void distributeCandyPositive()
	{
		int actual=distributeCandy(new int[] {1,1,1,1,1,1});
		int expected =1;

		Assert.assertEquals(expected, actual);
	}
	@Test
	public void distributeCandyPositive1()
	{
		int actual=distributeCandy(new int[] {1,1,1,1,1,5});
		int expected =2;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void distributeCandyNegative()
	{
		int actual=distributeCandy(new int[] {1,1,1,4,5,6});
		int expected =3;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void distributeCandyNegative1()
	{
		int actual=distributeCandy(new int[] {1,2,3,4,5,5});
		int expected =3;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void distributeCandyNegative2()
	{
		int actual=distributeCandy(new int[] {6,6,6,6});
		int expected =1;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void distributeCandyEdge()
	{
		int actual=distributeCandy(new int[] {1});
		int expected =1;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void distributeCandyEdge1()
	{
		int actual=distributeCandy(new int[] {1,2,3,4,5,6});
		int expected =3;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void distributeCandyEdge2()
	{
		int actual=distributeCandy(new int[] {1,5,5,-5,4,3});
		int expected =3;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void distributeCandyEdge3()
	{
		int actual=distributeCandy(new int[] {7,8,7,5,7,4,7,7,});
		int expected =4;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void distributeCandyEdge4()
	{
		int actual=distributeCandy(new int[] {7,8,7,5,7,4,7,7,6,6});
		int expected =5;
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void distributeCandyEdge5()
	{
		int actual=distributeCandy(new int[] {1,2,3,4,4,4,4,4,5,7,7,7,9,9});
		int expected =7;
		Assert.assertEquals(expected, actual);
	}
}
