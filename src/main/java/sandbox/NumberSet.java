package sandbox;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Given a set of numbers and another number, find all pairs in the set that add up to given number.
// Solution: http://javarevisited.blogspot.com/2014/08/how-to-find-all-pairs-in-array-of-integers-whose-sum-equal-given-number-java.html	
// Solution cuts down on the O(n^2) time by iterating over base list and for each number checking to see if the list has any 
// other value that could be used to get to a sum of testNumber.
public class NumberSet {

	public static List<HashMap<Integer, Integer>> getPairs(final int testNumber, final List<Integer> numberPool) {
		
		List<HashMap<Integer, Integer>> pairs = new ArrayList<HashMap<Integer, Integer>>();
		List<Integer> alreadyProcessed = new ArrayList<>();
		
		for (int i = 0; i < numberPool.size(); i++) {
			for (int k = 0; k < numberPool.size(); k++) {
				if (i != k) {
					int addition = numberPool.get(i) + numberPool.get(k);
					if (addition == testNumber && !alreadyProcessed.contains(numberPool.get(i))) {
						HashMap<Integer, Integer> map = new HashMap<>();
						map.put(numberPool.get(i), numberPool.get(k));
						pairs.add(map);
						alreadyProcessed.add(numberPool.get(i));
						alreadyProcessed.add(numberPool.get(k));
					}
				}
			}
		}
		
		System.out.println(pairs);

		return pairs;
	}
}
