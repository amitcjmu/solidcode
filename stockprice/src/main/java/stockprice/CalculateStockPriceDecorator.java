/**
 * 
 */
package stockprice;

import java.util.List;

/**
 * @author achou9
 *
 */
public abstract class CalculateStockPriceDecorator extends CalculateStockPrice {

	List<String> items;
	public Integer addStocks(){
		int totalPrice=0;
		for (String item: items){
			totalPrice += Integer.parseInt(StockMap.valueOf(item).toString());
		}
		return totalPrice;
	}
}
