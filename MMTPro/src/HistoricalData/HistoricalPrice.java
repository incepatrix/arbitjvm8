package HistoricalData;

import java.time.LocalDate;

public class HistoricalPrice {
	private final LocalDate _date;
	private final Double _open;
	private final Double _close;
	private final Double _high;
	private final Double _low;
	
	public HistoricalPrice(Double high_, Double low_, Double open_, Double close_, LocalDate date_)
	{
		_date = date_;
		_open = open_;
		_close = close_;
		_high = high_;
		_low = low_;
	}

	public Double getOpen() {
		return _open;
	}

	public Double getClose() {
		return _close;
	}

	public Double getHigh() {
		return _high;
	}

	public Double getLow() {
		return _low;
	}

	public LocalDate getDate() {
		return _date;
	}
}
