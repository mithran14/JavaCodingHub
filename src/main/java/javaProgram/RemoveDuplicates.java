package javaProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;


public class RemoveDuplicates {
	
	public Map<Integer, Integer> duplicate(int[] num) {
		
		Map<Integer,Integer> out = new HashMap<>();
		for (int n : num) {
			out.put(n, out.getOrDefault(n, 0)+1);
		}
		
		Iterator<Map.Entry<Integer, Integer>> iterator = out.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, Integer> entry = iterator.next();
			if (entry.getValue()>=2) {
				iterator.remove();
			}
		}
		return out;
	}

	@Test
	public void positiveinput() {
		int[] actual =  {1,2,1};
		Map<Integer, Integer> expected = new HashMap<>();
		expected.put(2,1);
		Assert.assertEquals(expected, duplicate(actual));
	}
	@Test
	public void negativeinput() {
		int[] actual =  {1,2,-3,-1,-1,-3};
		Map<Integer, Integer> expected = new HashMap<>();
		expected.put(1,1);
		expected.put(2,1);
		Assert.assertEquals(expected, duplicate(actual));
	}
	@Test
	public void edgeinput() {
		int[] actual =  {0,100,0,-100};
		Map<Integer, Integer> expected = new HashMap<>();
		expected.put(100,1);
		expected.put(-100,1);
		Assert.assertEquals(expected, duplicate(actual));
	}

}
