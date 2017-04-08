package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HackerRankInsertionSort {

	public static void main(final String[] args) {

		Scanner in = new Scanner(System.in);

		//System.out.print("Enter the number of values: ");
		final int numberOfElements = in.nextInt();
		
		in.nextLine();
		
		//System.out.print("Enter the list: ");
		String inputLine = in.nextLine();
		
		in.close();
		
		String[] inputElements = inputLine.split("\\s+");
		Integer[] integerArray = new Integer[numberOfElements];
		List<Integer> integerList = new ArrayList<>();
		
		for (int i = 0; i < numberOfElements; i++) {
			integerList.add(Integer.parseInt(inputElements[i]));
			integerArray[i] = Integer.parseInt(inputElements[i]);	
		}
		
		insertionSort(integerList);
	}

	private static void insertionSort(final List<Integer> integerList) {
		
		for (int insertPoint = 0; insertPoint < integerList.size(); insertPoint++) {
			Integer comparison = integerList.get(insertPoint);
			for (int elementOutOfPlace = insertPoint; elementOutOfPlace < integerList.size(); elementOutOfPlace++) {
				Integer comparison2 = integerList.get(elementOutOfPlace);
				if (comparison > comparison2) {
					shiftArray(integerList, elementOutOfPlace, insertPoint);
				}
			}
		}
	}

	public static void shiftArray(final List<Integer> integerList, final int elementOutOfPlace, final int insertPoint) {
		
		Integer valueToReplace = integerList.get(elementOutOfPlace);
		
		for (int i = elementOutOfPlace; i >= 1; i--) {
			if (i != insertPoint) {
				integerList.set(i, integerList.get(i - 1));
				display(integerList);
			} else {
				break;
			}
		}
		
		integerList.set(insertPoint, valueToReplace);
		display(integerList);
	}

	private static void display(List<Integer> integerList) {
		StringBuilder builder = new StringBuilder();
		for (Integer value : integerList) {
			builder.append(value + " ");
		}
		System.out.println(builder.toString());		
	}
}