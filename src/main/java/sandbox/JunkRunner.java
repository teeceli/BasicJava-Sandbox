package sandbox;

import java.util.ArrayList;
import java.util.List;

public class JunkRunner {

	public static void main(String[] args) {

		String unique = "tes";
		boolean isUnique = hasUniqueChars(unique);
		
		System.out.println(isUnique);
	}
	
	public static boolean hasUniqueChars(final String test) {

		char[] charArray = test.toCharArray();
		List<Character> newCharArray = new ArrayList<Character>();

		for (final char c : charArray) {
			if (newCharArray.contains(c)) {
				return false;
			} else {
				newCharArray.add(c);
			}
		}

		return true;
	}

}
