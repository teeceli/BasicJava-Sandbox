package interviewcake;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class InterviewCake1Test {
	
	List<Integer> positiveProfitList = Arrays.asList(10, 7, 5, 8, 11, 9);
	
	List<Integer> negativeProfitList = Arrays.asList(10, 7, 5, 4, 3, 2, 0);
	
	final static InterviewCakeHelper icHelper = new InterviewCakeHelper();

	@Test
	public void testPositiveProfit() {
		
		Integer profit = 6;
		
		Integer bestProfit = icHelper.getMaxProfit(positiveProfitList);
		
		assertEquals(profit, bestProfit);

	}

	@Test
	public void testNegativeProfit() {
		
		Integer profit = -1;
		
		Integer bestProfit = icHelper.getMaxProfit(negativeProfitList);
		
		assertEquals(profit, bestProfit);
		
	}

}
