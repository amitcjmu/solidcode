package stockprice;

import java.util.Collections;
import java.util.List;

public class StockADecorator extends CalculateStockPriceDecorator {

	CalculateStockPrice calculateStockPrice;
	public String stockA = "A";
	Integer stockACounter = 1;

	public StockADecorator(CalculateStockPrice calculateStockPrice, List<String> items) {
		this.calculateStockPrice = calculateStockPrice;
		this.items = items;
	}

	@Override
	public Integer getTotalPriceByItem() {
		if (discountPriceCounter() >=3 )
			return totalDiscountPrice();
		else
			return calculateStockPrice.getTotalPriceByItem() + addStocks();
	}

	public Integer discountPriceCounter() {
		Collections.sort(items);
		for (String item : items) {
			if (item.equals(stockA)) {
				stockACounter++;
			}
		}
		return stockACounter;
	}

	public Integer totalDiscountPrice() {
		int stockATotal = stockACounter / 3;
		return stockATotal * 130;

	}

}
