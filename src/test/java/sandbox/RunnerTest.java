package sandbox;

import static org.junit.Assert.*;
import org.junit.Test;

public class RunnerTest {

	@Test
	public void runMeTestFalse(){

		String expected = "Hello world";

		String actual = Runner.runMe();

		assertNotEquals(expected, actual);
	}
	
	@Test
	public void runMeTestTrue(){

		String expected = "Hello World";

		String actual = Runner.runMe();

		assertEquals(expected, actual);
	}
}