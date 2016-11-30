/**
 * 
 */
package stockprice;

/**
 * @author achou9
 *
 */
public class StockDDecorator extends CalculateStockPriceDecorator {

CalculateStockPrice calculateStockPrice;
	
	public StockDDecorator(CalculateStockPrice calculateStockPrice) {
		this.calculateStockPrice = calculateStockPrice;
	}
	
	/* (non-Javadoc)
	 * @see stockprice.CalculateStockPrice#getTotalPriceByItem()
	 */
	@Override
	public Integer getTotalPriceByItem() {
		return calculateStockPrice.getTotalPriceByItem() + 15 ;
	}

}
