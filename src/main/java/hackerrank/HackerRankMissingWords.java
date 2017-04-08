package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class HackerRankMissingWords {
		
	public static void main(String[] args) {
		
		String baseString = "I am using HackerRank to improve programming";
		String comparisonString = "am HackerRank to improve";
		
		String[] baseStringArray = baseString.split(" ");
		List<String> missingList = new ArrayList<>();
				
		for (int i = 0; i < baseStringArray.length; i++) {
			String toCompare = baseStringArray[i];
			if (!comparisonString.contains(toCompare)) {
				missingList.add(toCompare);
				System.out.println(toCompare);
			}
		}
		
		String[] stockArr = new String[missingList.size()];
		stockArr = missingList.toArray(stockArr);
		
		//String[] missingArray = missingList.toArray();
		System.out.println(stockArr);
	}
}
