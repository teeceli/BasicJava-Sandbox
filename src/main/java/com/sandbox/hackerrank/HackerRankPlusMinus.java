package com.sandbox.hackerrank;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class HackerRankPlusMinus {

	public static void main(String[] args) {

		int[] array = {-4, 3, -9, 0, 4, 1};;
		
		Map<String, Float> map = plusMinus(array);
		
		System.out.println(map);
	}
	
	public static Map<String, Float> plusMinus(final int[] array) {
		
		Map<String, Float> map = new HashMap<>();
		
		Integer arraySize = array.length;
		Float posCount = 0f;
		Float negCount = 0f;
		Float zeroCount = 0f;
		
		for (int i : array) {
			if (i < 0) {
				negCount++;
			} else if (i > 0) {
				posCount++;
			} else if (i == 0) {
				zeroCount++;
			}
		}
		
		Float posRatio = calculateRatio(posCount, arraySize);
		Float negRatio = calculateRatio(negCount, arraySize);
		Float zeroRatio = calculateRatio(zeroCount, arraySize);
		
		map.put("posRatio", posRatio);
		map.put("negRatio", negRatio);
		map.put("zeroRatio", zeroRatio);
		
		return map;
	}
	
	private static Float calculateRatio(final Float count, final Integer arraySize) {

		Float ratioValue = count / arraySize;
		
		BigDecimal roundRatio = new BigDecimal(ratioValue).setScale(6, BigDecimal.ROUND_HALF_UP);

		Float ratio = roundRatio.floatValue();
		
		return ratio;
	}
}