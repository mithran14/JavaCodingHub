package javaProgram;

import org.junit.Assert;
import org.junit.Test;

public class MaxProfits {
	
	/*
	 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
	 * Best Time to Buy and Sell Stock
	

	You are given an array prices where prices[i] is the price of a given stock on the ith day.

	You want to maximize your profit by choosing a single day to buy one stock and 
	choosing a different day in the future to sell that stock.

	Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, 
	return 0.

	Example 1:

	Input: prices = [7,1,5,3,6,4]
	Output: 5
	Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
	Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
	
	Example 2:

	Input: prices = [7,6,4,3,1]
	Output: 0
	Explanation: In this case, no transactions are done and the max profit = 0.
	
	*/
	
	public int maxProfit(int[] arr) {
		int profit = 0;
		for (int i = 0; i < arr.length; i++) {
			int min =arr[i];
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]>min) {
					if ((arr[j]-min)> profit) {
						profit= arr[j]-min;
					}
				}
			}
		}
		return profit;
	}
	
	@Test
	public void maxProfitPositive() {
		int maxProfit = maxProfit(new int[] {7,1,5,3,6,4});	
		Assert.assertEquals(5, maxProfit);
	}
	@Test
	public void maxProfitPositive1() {
		int maxProfit = maxProfit(new int[] {8,1,2,3,4,5});	
		Assert.assertEquals(4, maxProfit);
	}
	@Test
	public void maxProfitNegative() {
		int maxProfit = maxProfit(new int[] {8,7,6,4,3,1});	
		Assert.assertEquals(0, maxProfit);
	}
	@Test
	public void maxProfitNegative1() {
		int maxProfit = maxProfit(new int[] {-6,-8,6,4,3,1});	
		Assert.assertEquals(14, maxProfit);
	}
	@Test
	public void maxProfitEdge() {
		int maxProfit = maxProfit(new int[] {7});	
		Assert.assertEquals(0, maxProfit);
	}


}
