package stockprice;

import java.util.Collections;
import java.util.List;

public class StockBDecorator extends CalculateStockPriceDecorator {

CalculateStockPrice calculateStockPrice;
public String stockB = "B";
Integer stockBCounter = 1;

	
	public StockBDecorator(CalculateStockPrice calculateStockPrice, List<String> items) {
		this.calculateStockPrice = calculateStockPrice;
		this.items = items;
	}
	
	@Override
	public Integer getTotalPriceByItem() {
		if (discountPriceCounter() >=2 )
			return totalDiscountPrice();
		else
			return calculateStockPrice.getTotalPriceByItem() + addStocks();
	}

	public Integer discountPriceCounter() {
		Collections.sort(items);
		for (String item : items) {
			if (item.equals(stockB)) {
				stockBCounter++;
			}
		}
		return stockBCounter;
	}

	public Integer totalDiscountPrice() {
		int stockATotal = stockBCounter / 2;
		return stockATotal * 45;

	}

}
