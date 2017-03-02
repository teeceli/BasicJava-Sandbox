package examples;

public class Dog implements Animal{

	@Override
	public String speak() {
		String speak = "ruff";
		System.out.println(speak);
		return speak;
	}

	@Override
	public String eat() {
		String eat = "eats dog food";
		System.out.println(eat);
		return eat;
	}
}
