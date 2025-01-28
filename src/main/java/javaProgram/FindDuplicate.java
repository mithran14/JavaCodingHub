package javaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Assert;
import org.junit.Test;


public class FindDuplicate {
	
	public List<Integer> duplicate(int[] num) {
		
		List<Integer> a = new ArrayList<Integer>();
		Map<Integer,Integer> out = new HashMap<>();
		for (int n : num) {
			out.put(n, out.getOrDefault(n, 0)+1);
		}
		for (Entry<Integer,Integer> entry : out.entrySet()) {
			if (entry.getValue()>=2) {
				a.add(entry.getKey());
			}
		}
		return a;
	}

	@Test
	public void positiveinput() {
		List<Integer> actual = duplicate(new int[] {1,2,1});
		List<Integer> expected = Arrays.asList(1);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void negativeinput() {
		List<Integer> actual = duplicate(new int[] {1,2,-3,-1,-1,-3});
		List<Integer> expected = Arrays.asList(-1,-3);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void edgeinput() {
		List<Integer> actual = duplicate(new int[] {0,100,0,-100});
		List<Integer> expected = Arrays.asList(0);
		Assert.assertEquals(expected, actual);
	}

}
