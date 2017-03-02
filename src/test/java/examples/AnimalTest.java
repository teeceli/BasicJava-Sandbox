package examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalTest {

	@Test
	public void getBirdSpeakTest() {
		Animal bird = new Bird();
		String actualSpeak = bird.speak();
		String expectedSpeak = "tweet";
		assertEquals(expectedSpeak, actualSpeak);
	}
}
