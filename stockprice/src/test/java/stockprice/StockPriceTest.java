package stockprice;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StockPriceTest {

	
	@Test
	public void total_price_stock_value_A()
	{
		String item = "A";
		Integer EmptyItemvalue = 50;
		CalculateStockPrice calculateStockPrice = new StockA();
		Integer totalPrice = calculateStockPrice.getTotalPriceByItem();
		assertEquals(totalPrice, EmptyItemvalue);
	}
	
	@Test
	public void total_price_stock_value_B()
	{
		String item = "B";
		Integer EmptyItemvalue = 30;
		CalculateStockPrice calculateStockPrice = new StockB();
		Integer totalPrice = calculateStockPrice.getTotalPriceByItem();
		assertEquals(totalPrice, EmptyItemvalue);
	}
	
	@Test
	public void total_price_stock_value_C()
	{
		String item = "C";
		Integer EmptyItemvalue = 20;
		CalculateStockPrice calculateStockPrice = new StockC();
		Integer totalPrice = calculateStockPrice.getTotalPriceByItem();
		assertEquals(totalPrice, EmptyItemvalue);
	}
	
	@Test
	public void total_price_stock_value_D()
	{
		String item = "D";
		Integer EmptyItemvalue = 15;
		CalculateStockPrice calculateStockPrice = new StockD();
		Integer totalPrice = calculateStockPrice.getTotalPriceByItem();
		assertEquals(totalPrice, EmptyItemvalue);
	}
	
}
