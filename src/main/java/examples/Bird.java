package examples;

public class Bird implements Animal{

	Beak beak;
	
	public Bird() {
		this.beak = new Beak();
	}
	
	@Override
	public String speak() {
		String speak = "tweet";
		System.out.println(speak);
		beak.setLength(5);
		System.out.println("Beak length: " + beak.getLength());
		return speak;
	}

	@Override
	public String eat() {
		String eat = "eats bird food";
		System.out.println(eat);
		return eat;
	}
}
