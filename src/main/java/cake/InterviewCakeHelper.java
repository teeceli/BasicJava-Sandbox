package cake;

import java.util.List;

public class InterviewCakeHelper {
	
	public Integer getMaxProfit(List<Integer> stockPricesYesterday) {
			
		Integer currentBestProfit = -9999;
		Integer minPrice = stockPricesYesterday.get(0);
		
		for (int i = 0; i < stockPricesYesterday.size() - 1; i++) {
			
			if (stockPricesYesterday.get(i) < minPrice) {
				minPrice = stockPricesYesterday.get(i);
			}

			Integer tmpProfit = stockPricesYesterday.get(i+1) - minPrice;
			
			if (tmpProfit > currentBestProfit) {
				currentBestProfit = tmpProfit;
			}
		}
		
		return currentBestProfit;
	}
	
}
