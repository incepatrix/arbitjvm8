package HistoricalData;

import Data.IData;

public class HistoricalPriceData implements IData<HistoricalPrice> {

	private final HistoricalPrice _historicalPrice;
	private final boolean _isEmpty;
	
	public HistoricalPriceData(HistoricalPrice historicalPrice_)
	{
		_historicalPrice = historicalPrice_;
		_isEmpty = true;
	}
	
	@Override
	public HistoricalPrice get() {		
		return _historicalPrice;
	}
	
	@Override
	public boolean isEmpty() 
	{
		return _isEmpty;
	}

}
