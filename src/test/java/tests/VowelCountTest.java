package tests;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import codewars.VowelCount;

public class VowelCountTest {
   
	@Test
    public void testCase1() {
      assertEquals("Nope!", 5, VowelCount.getCount("abracadabra"));
    }
    
}