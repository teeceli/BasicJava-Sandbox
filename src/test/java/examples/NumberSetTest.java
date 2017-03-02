package examples;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

// Given a set of numbers and another number, find all pairs in the set that add up to given number.
// Solution: http://javarevisited.blogspot.com/2014/08/how-to-find-all-pairs-in-array-of-integers-whose-sum-equal-given-number-java.html	
public class NumberSetTest {

	
	List<Integer> numberPool = new ArrayList<>();

	@Before
	public void setUp() {
		
		// {5, 4, 8, 15, 11, 17, 1}
		// 12
		// {4:8}, {11,1}
				
		numberPool.add(5);
		numberPool.add(4);
		numberPool.add(8);
		numberPool.add(15);
		numberPool.add(11);
		numberPool.add(17);
		numberPool.add(1);	
	}
	
	@Test
	public void testGetPairs() {
		
		List<HashMap<Integer, Integer>> expectedList = new ArrayList<HashMap<Integer, Integer>>();
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		hash.put(4, 8);
		expectedList.add(hash);
		
		HashMap<Integer, Integer> hash2 = new HashMap<Integer, Integer>();
		hash2.put(11, 1);
		expectedList.add(hash2);
		
		int testNumber = 16;
		List<HashMap<Integer, Integer>> actualList = NumberSet.getPairs(testNumber, numberPool);

		assertEquals(expectedList, actualList);
	}

	@Test
	public void testGetPairs2() {
		
		List<Integer> numberPool = new ArrayList<>();
		numberPool.add(-1);	
		numberPool.add(3);
		numberPool.add(5);
		numberPool.add(7);
		numberPool.add(-2);
		numberPool.add(8);
		numberPool.add(1);

		List<HashMap<Integer, Integer>> expectedList = new ArrayList<HashMap<Integer, Integer>>();
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		hash.put(-1, 7);
		expectedList.add(hash);
		
		HashMap<Integer, Integer> hash2 = new HashMap<Integer, Integer>();
		hash2.put(5, 1);
		expectedList.add(hash2);

		HashMap<Integer, Integer> hash3 = new HashMap<Integer, Integer>();
		hash3.put(-2, 8);
		expectedList.add(hash3);
		
		int testNumber = 6;
		List<HashMap<Integer, Integer>> actualList = NumberSet.getPairs(testNumber, numberPool);
		
		assertEquals(expectedList, actualList);
	}
}
