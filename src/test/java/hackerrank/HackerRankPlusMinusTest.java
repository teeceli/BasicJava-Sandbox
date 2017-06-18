package hackerrank;

import static org.junit.Assert.*;
import java.util.Map;

import org.junit.Test;

public class HackerRankPlusMinusTest {
	
	@Test
	public void plusMinusTest1(){
		
		int[] testArray = {1, 2, -1, 3, 0, 5, -6, 4, 3, 9, 7};
		Float expectedPosRatio = 0.727273f;
		Float expectedNegRatio = 0.181818f;
		Float expectedZeroRatio = 0.090909f;
		
		Map<String, Float> ratioMap = HackerRankPlusMinus.plusMinus(testArray);
	
		assertEquals(expectedPosRatio, ratioMap.get("posRatio"));
		assertEquals(expectedNegRatio, ratioMap.get("negRatio"));
		assertEquals(expectedZeroRatio, ratioMap.get("zeroRatio"));
	}

	@Test
	public void plusMinusTest2(){
		
		int[] testArray = {-4, 3, -9, 0, 4, 1};
		Float expectedPosRatio = 0.500000f;
		Float expectedNegRatio = 0.333333f;
		Float expectedZeroRatio = 0.166667f;
		
		Map<String, Float> ratioMap = HackerRankPlusMinus.plusMinus(testArray);
		
		assertEquals(expectedPosRatio, ratioMap.get("posRatio"));
		assertEquals(expectedNegRatio, ratioMap.get("negRatio"));
		assertEquals(expectedZeroRatio, ratioMap.get("zeroRatio"));
	}
}