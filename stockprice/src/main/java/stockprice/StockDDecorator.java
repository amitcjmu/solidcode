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
List<String> items;
	
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

	public Integer addStocks(){
		int totalPrice=0;
		for (String item: items){
			totalPrice += Integer.parseInt(StockMap.valueOf(item).toString());
		}
		return totalPrice;
	}
}
