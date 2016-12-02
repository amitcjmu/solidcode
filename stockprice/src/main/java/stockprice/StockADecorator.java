package stockprice;

import java.util.List;

public class StockADecorator extends CalculateStockPriceDecorator {

	CalculateStockPrice calculateStockPrice;
	
	public StockADecorator(CalculateStockPrice calculateStockPrice, List<String> items) {
		this.calculateStockPrice = calculateStockPrice;
		this.items = items;
	}

		@Override
		public Integer getTotalPriceByItem() {
			return calculateStockPrice.getTotalPriceByItem() + addStocks();
		}
	}

