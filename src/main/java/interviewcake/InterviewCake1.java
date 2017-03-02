package interviewcake;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Stock Price Best Profit Calculator
 * https://www.interviewcake.com/question/java/stock-price
 * Solution on web site is a little more elegant because of not needing to 
 * initialize bestProfit to -9999 but I think mine is easier to read. 
 */

public class InterviewCake1 {
	
	final static Logger logger = LoggerFactory.getLogger(InterviewCake1.class);
	
	final static InterviewCakeHelper icHelper = new InterviewCakeHelper();

	public static void main(String[] args) {
				
		List<Integer> stockPricesYesterday = Arrays.asList(10, 7, 5, 8, 11, 9);			
		
		Integer bestProfit = icHelper.getMaxProfit(stockPricesYesterday);
		
		logger.info("best profit: " + bestProfit.toString());
		
	}
	
}
