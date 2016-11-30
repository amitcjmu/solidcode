package stockprice;

public class StockADecorator extends CalculateStockPriceDecorator {

	CalculateStockPrice calculateStockPrice;
	
	public StockADecorator(CalculateStockPrice calculateStockPrice) {
		this.calculateStockPrice = calculateStockPrice;
	}

		@Override
		public Integer getTotalPriceByItem() {
			return calculateStockPrice.getTotalPriceByItem() + 50 ;
		}
	}

