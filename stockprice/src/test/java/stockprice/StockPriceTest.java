package stockprice;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StockPriceTest {

	@Test
	public void stock_value_empty() {
		String item = "";
		Integer EmptyItemvalue = 0;
		CalculateStockPrice calculateStockPrice = new CalculateStockPrice();
		Integer totalPrice = calculateStockPrice.getTotalPriceByItem(item);
		assertEquals(totalPrice, EmptyItemvalue);
	}
}
