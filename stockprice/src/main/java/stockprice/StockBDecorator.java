package stockprice;

public class StockBDecorator extends CalculateStockPriceDecorator {

CalculateStockPrice calculateStockPrice;
	
	public StockBDecorator(CalculateStockPrice calculateStockPrice) {
		this.calculateStockPrice = calculateStockPrice;
	}
	
	@Override
	public Integer getTotalPriceByItem() {
		return calculateStockPrice.getTotalPriceByItem() + 30 ;
	}

}
