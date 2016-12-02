package stockprice;

import java.util.List;

public class StockBDecorator extends CalculateStockPriceDecorator {

CalculateStockPrice calculateStockPrice;
	
	public StockBDecorator(CalculateStockPrice calculateStockPrice, List<String> items) {
		this.calculateStockPrice = calculateStockPrice;
		this.items = items;
	}
	
	@Override
	public Integer getTotalPriceByItem() {
		return calculateStockPrice.getTotalPriceByItem() + addStocks();
	}

}
