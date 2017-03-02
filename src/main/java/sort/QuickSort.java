package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import examples.StaticInitialization;

public class QuickSort {
	
	final static Logger logger = LoggerFactory.getLogger(StaticInitialization.class);
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 8, 7, 5, 9);
		 
		numbers = quicksort(numbers);
		
		logger.info(numbers.toString());
		
	}
	
	public static List<Integer> quicksort(List<Integer> numbers) { 
		
		if (numbers.size() < 2) {
			return numbers; 
		}
		
		final Integer pivot = numbers.get(0);
		final List<Integer> lower = new ArrayList<>(); 
		final List<Integer> higher = new ArrayList<>();
		
		for (int i = 1; i <	numbers.size(); i++) {
			if (numbers.get(i) < pivot) {
				lower.add(numbers.get(i)); 
			} else {
				higher.add(numbers.get(i));
			}
		}
		
		final List<Integer> sorted = quicksort(lower);
		
		sorted.add(pivot); 
		sorted.addAll(quicksort(higher));
		
		return sorted;
	}
}
