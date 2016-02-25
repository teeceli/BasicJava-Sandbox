package interviewcake;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sandbox.StaticInitialization;

/*
 * Stock Price Best Profit Calculator
 * https://www.interviewcake.com/question/java/stock-price
 * Solution on web site is a little more elegant because of not needing to 
 * initialize bestProfit to -9999 but I think mine is easier to read. 
 * Still satisfies O(n) time complexity
 */

public class InterviewCake1 {
	
	final static Logger logger = LoggerFactory.getLogger(StaticInitialization.class);

	public static void main(String[] args) {
				
		List<Integer> stockPricesYesterday = Arrays.asList(15, 7, 5, 4, 2, 0);
		
		Integer bestProfit = getMaxProfit(stockPricesYesterday);
		
		logger.info("best profit: " + bestProfit.toString());
		
	}

	private static Integer getMaxProfit(List<Integer> stockPricesYesterday) {
		
		Integer profit = -9999;
		
		for (int i = 0; i < stockPricesYesterday.size() - 1; i++) {
			Integer tmpProfit = stockPricesYesterday.get(i+1) - stockPricesYesterday.get(i);
			if (tmpProfit > profit) {
				profit = tmpProfit;
			}
		}
		
		return profit;
	}

}
