package stockprice;

public class StockCDecorator extends CalculateStockPriceDecorator {

CalculateStockPrice calculateStockPrice;
	
	public StockCDecorator(CalculateStockPrice calculateStockPrice) {
		this.calculateStockPrice = calculateStockPrice;
	}
	
	@Override
	public Integer getTotalPriceByItem() {
		return calculateStockPrice.getTotalPriceByItem() + 20 ;
	}

}
