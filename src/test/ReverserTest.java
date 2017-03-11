package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import interview.Reverser;

public class ReverserTest {

	@Test
	public void testGetReverse() {

		String s1 = "hello";
		//String s2 = "lo";
		String s2 = "hel";
		//String s2 = "xyz";
		
		String actual = Reverser.getReverse(s1, s2);
		
		String expected = "lehlo";
		
		assertEquals(expected, actual);
	}
}
