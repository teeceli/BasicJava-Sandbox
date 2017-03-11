package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Reverser {

	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "hel";
		
		String result = getReverse(s1, s2);
		
		System.out.println(result);
	}
	
	public static String getReverse(final String s1, final String s2) {
		
		if (s1.contains(s2)) {
			char[] arrayToBeReversed = s2.toCharArray();
			List<Character> characterList = new ArrayList<>();
			
			Stack<Character> charStack = new Stack<>();
			Integer length = arrayToBeReversed.length;
			//[h, e, l]
			for (int i = 0; i < length; i++) {
				charStack.push(arrayToBeReversed[i]);
			}
			
			Character blah = charStack.pop();
			
			for (int i = 0; i < length; i++) {
				Character c = charStack.pop();
				characterList.add(c);
			}
		
			String reversed = characterList.toString();			
		}
		
		return null;
	}

	public static String getReverse2(final String s1, final String s2) {
		
		if (s1.contains(s2)) {
			char[] arrayToBeReversed = s2.toCharArray();
			char[] arrayBase = s1.toCharArray();
			Integer pointFound = s1.indexOf(s2);
						
			Integer length = arrayToBeReversed.length;
			//[h, e, l]
			for (int i = 0; i < length; i++) {
				for (int k = length - 1; k > 0; k--) {
					char c1 = arrayToBeReversed[i];
					char c2 = arrayToBeReversed[k];
					System.out.println("Pass: " + i + " c1: " + c1 + " c2: " + c2);
				}
			}
		}
		
		return null;
	}
}
