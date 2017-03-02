package codewars;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import codewars.CaffeineBuzz;

public class CaffeineBuzzTest {
	
	CaffeineBuzz cb;

	@Before
	public void setup() {
		cb = new CaffeineBuzz();

	}
	
	@Test
	public void testOne() {
		
		String buzz = cb.caffeineBuzz(1);
		assertEquals(buzz, "mocha_missing!");
	}
	
	@Test
	public void testThree() {
		
		String buzz = cb.caffeineBuzz(3);
		assertEquals(buzz, "Java");
	}

	@Test
	public void testSix() {
		
		String buzz = cb.caffeineBuzz(6);
		assertEquals(buzz, "JavaScript");
	}

	@Test
	public void testTwelve() {
		
		String buzz = cb.caffeineBuzz(12);
		assertEquals(buzz, "CoffeeScript");
	}

}
