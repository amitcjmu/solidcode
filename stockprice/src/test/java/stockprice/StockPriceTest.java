package stockprice;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

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
	
	
	@Test
	public void total_price_stock_value_AA()
	{
		List<String> items = Arrays.asList("A");
		Integer EmptyItemvalue = 100;
		CalculateStockPrice calculateStockPrice = new StockA();
		calculateStockPrice = new StockADecorator(calculateStockPrice, items);
		Integer totalPrice = calculateStockPrice.getTotalPriceByItem();
		assertEquals(totalPrice, EmptyItemvalue);
	}
	
	
	@Test
	public void total_price_stock_value_BB()
	{
		List<String> items = Arrays.asList("B");
		Integer EmptyItemvalue = 60;
		CalculateStockPrice calculateStockPrice = new StockB();
		calculateStockPrice = new StockBDecorator(calculateStockPrice, items);
		Integer totalPrice = calculateStockPrice.getTotalPriceByItem();
		assertEquals(totalPrice, EmptyItemvalue);
	}
	
	
	@Test
	public void total_price_stock_value_CC()
	{
		List<String> items = Arrays.asList("C");
		Integer EmptyItemvalue = 40;
		CalculateStockPrice calculateStockPrice = new StockC();
		calculateStockPrice = new StockCDecorator(calculateStockPrice, items);
		Integer totalPrice = calculateStockPrice.getTotalPriceByItem();
		assertEquals(totalPrice, EmptyItemvalue);
	}
	
	@Test
	public void total_price_stock_value_DD()
	{
		List<String> items = Arrays.asList("D");
		Integer EmptyItemvalue = 30;
		CalculateStockPrice calculateStockPrice = new StockD();
		calculateStockPrice = new StockDDecorator(calculateStockPrice, items);
		Integer totalPrice = calculateStockPrice.getTotalPriceByItem();
		assertEquals(totalPrice, EmptyItemvalue);
	}
	
	@Test
	public void total_price_stock_value_DA()
	{
		List<String> items = Arrays.asList("A");
		Integer EmptyItemvalue = 65;
		CalculateStockPrice calculateStockPrice = new StockD();
		calculateStockPrice = new StockDDecorator(calculateStockPrice, items);
		Integer totalPrice = calculateStockPrice.getTotalPriceByItem();
		assertEquals(totalPrice, EmptyItemvalue);
	}
	
}
