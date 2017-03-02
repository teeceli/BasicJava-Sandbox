package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ReverseApp {
	
	public static void main(String[] args) throws IOException {

		// Enter string
		// Create Array by pushing onto stack
		// Display in reverse order by popping from stack

		String input = pollUser();

		Reverser reverser = new Reverser(input);
		
		reverser.display();
		reverser.doReverse();
	}
	
	public static String pollUser() throws IOException {

		System.out.println("Enter word: ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();

		return s;
	}
	
}