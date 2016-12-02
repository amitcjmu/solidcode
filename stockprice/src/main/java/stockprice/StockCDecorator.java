package stockprice;

import java.util.List;

public class StockCDecorator extends CalculateStockPriceDecorator {

CalculateStockPrice calculateStockPrice;
	
	public StockCDecorator(CalculateStockPrice calculateStockPrice, List<String> items) {
		this.calculateStockPrice = calculateStockPrice;
		this.items = items;
	}
	
	@Override
	public Integer getTotalPriceByItem() {
		return calculateStockPrice.getTotalPriceByItem() + addStocks();
	}

}
