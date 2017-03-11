package hackerrank;

import java.util.Scanner;

public class HackerRankTriplets {
	
	static Integer challenger1 = 0;
	static Integer challenger2 = 0;
	
	public static void main(final String[] args) {
			
		Scanner in = new Scanner(System.in);

		String input1 = in.nextLine();
		String[] challengerScores1 = input1.split("\\s+");

		String input2 = in.nextLine();
		String[] challengerScores2 = input2.split("\\s+");
		
		String score = getScores(challengerScores1, challengerScores2);
		
		System.out.println(score);
		
		in.close();	
	}

	public static String getScores(final String[] challengerScores1, final String[] challengerScores2) {
		
		for (int i = 0; i < challengerScores1.length; i++) {
			Integer firstValue = Integer.parseInt(challengerScores1[i]);
			Integer secondValue = Integer.parseInt(challengerScores2[i]);
			
			compareIndividualScores(firstValue, secondValue);
		}
		
		return challenger1 + " " + challenger2;
	}

	public static void compareIndividualScores(final Integer firstValue, final Integer secondValue) {
		if (firstValue > secondValue) {
			challenger1++;
		} else if (secondValue > firstValue) {
			challenger2++;
		}
	}
}