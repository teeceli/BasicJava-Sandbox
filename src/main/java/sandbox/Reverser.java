package sandbox;

class Reverser {
	
// constructor
// display
// doReverse - initialize stack, push chars, pop chars by appending to new string

private String input;
private String output;

	public Reverser (String in) {
		
		input = in;
	}

	public void display() {
		
		System.out.println("Entered: " + input);
	}
	
	public String doReverse() {
		
		String reversedWord = null;
		
		//create Stack
		MyStack myStack = new MyStack(input.length());
		myStack.howLarge();
		
		// push characters onto stackArray
		for (int i = 0; i < input.length(); i++) {
			myStack.push(input.charAt(i));
		}
		
		System.out.println("myStack[0]: " + myStack.toString());

		// traverse stack and pop off elements and append them to new output string
		String newOutput = "";
		for (int k = input.length(); k > 0; k--) {
			char poppedChar = myStack.pop();
			newOutput = newOutput + poppedChar;
		}
		
		//System.out.println("myStack[]: " + myStack.toString());
		System.out.println("New Word: " + newOutput);
		
		return reversedWord;
	}

}