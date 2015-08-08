package HistoricalData;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

import Analytics.IAnalytics;

public class HistoricalDataAnalytics implements IAnalytics<HistoricalPriceData> {

	public static List<HistoricalPriceData> getSortedHighPrices(List<HistoricalPriceData> prices_) 
	{
		return prices_.stream().map(d -> d.get())
				.sorted(Comparator.comparing(HistoricalPrice::getHigh))
				.map(hd -> new HistoricalPriceData(hd))
				.collect(Collectors.toList());
	}
	
	public static HistoricalPriceData getHigheshPrice(List<HistoricalPriceData> prices_)
	{
		return new HistoricalPriceData(prices_.stream().map(d -> d.get())
				.max(Comparator.comparing(HistoricalPrice::getHigh))
				.get());				
	}
}
