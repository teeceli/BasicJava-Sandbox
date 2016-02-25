package interviewcake;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sandbox.StaticInitialization;

public class InterviewCake1 {
	
	final static Logger logger = LoggerFactory.getLogger(StaticInitialization.class);

	public static void main(String[] args) {
		
		//Integer[] stockPricesYesterday = {15, 7, 5, 2, 1, 0};
		
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
