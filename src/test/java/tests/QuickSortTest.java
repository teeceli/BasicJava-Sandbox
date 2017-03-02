package tests;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import sort.QuickSort;


public class QuickSortTest {
	
	@Test
	public void quickSortTestTrue() {
		
		List<Integer> numbers = Arrays.asList(1, 7, 5, 3);
		List<Integer> expected = Arrays.asList(1, 3, 5, 7);
		
		numbers = QuickSort.quicksort(numbers);

		Assert.assertEquals(numbers, expected);

	}

	@Test
	public void quickSortTestFalse() {
		
		List<Integer> numbers = Arrays.asList(1, 7, 5, 3);
		List<Integer> expected = Arrays.asList(1, 7, 5, 3);
		
		numbers = QuickSort.quicksort(numbers);
		
		Assert.assertNotEquals(numbers, expected);
		
	}

}
