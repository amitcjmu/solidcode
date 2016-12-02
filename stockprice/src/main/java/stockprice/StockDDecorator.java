/**
 * 
 */
package stockprice;

import java.util.List;

/**
 * @author achou9
 *
 */
public class StockDDecorator extends CalculateStockPriceDecorator {

CalculateStockPrice calculateStockPrice;
	
	public StockDDecorator(CalculateStockPrice calculateStockPrice, List<String> items) {
		this.calculateStockPrice = calculateStockPrice;
		this.items = items;
	}
	
	/* (non-Javadoc)
	 * @see stockprice.CalculateStockPrice#getTotalPriceByItem()
	 */
	@Override
	public Integer getTotalPriceByItem() {
		return calculateStockPrice.getTotalPriceByItem() + addStocks() ;
	}

}
