package stockprice;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class StockPriceTest {

	
	@Test
	public void total_price_stock_value_A()
	{
		Integer stockAPrice = 50;
		CalculateStockPrice calculateStockPrice = new StockA();
		Integer totalPrice = calculateStockPrice.getTotalPriceByItem();
		assertEquals(totalPrice, stockAPrice);
	}
	
	@Test
	public void total_price_stock_value_B()
	{
		Integer stockBPrice = 30;
		CalculateStockPrice calculateStockPrice = new StockB();
		Integer totalPrice = calculateStockPrice.getTotalPriceByItem();
		assertEquals(totalPrice, stockBPrice);
	}
	
	@Test
	public void total_price_stock_value_C()
	{
		Integer stockCPrice = 20;
		CalculateStockPrice calculateStockPrice = new StockC();
		Integer totalPrice = calculateStockPrice.getTotalPriceByItem();
		assertEquals(totalPrice, stockCPrice);
	}
	
	@Test
	public void total_price_stock_value_D()
	{
		Integer stockDPrice = 15;
		CalculateStockPrice calculateStockPrice = new StockD();
		Integer totalPrice = calculateStockPrice.getTotalPriceByItem();
		assertEquals(totalPrice, stockDPrice);
	}
	
	
	@Test
	public void total_price_stock_value_AA()
	{
		List<String> items = Arrays.asList("A");
		Integer stockAAPrice = 100;
		CalculateStockPrice calculateStockPrice = new StockA();
		calculateStockPrice = new StockADecorator(calculateStockPrice, items);
		Integer totalPrice = calculateStockPrice.getTotalPriceByItem();
		assertEquals(totalPrice, stockAAPrice);
	}
	
	
	@Test
	public void total_price_stock_value_CC()
	{
		List<String> items = Arrays.asList("C");
		Integer stockCCPrice = 40;
		CalculateStockPrice calculateStockPrice = new StockC();
		calculateStockPrice = new StockCDecorator(calculateStockPrice, items);
		Integer totalPrice = calculateStockPrice.getTotalPriceByItem();
		assertEquals(totalPrice, stockCCPrice);
	}
	
	@Test
	public void total_price_stock_value_DD()
	{
		List<String> items = Arrays.asList("D");
		Integer stockDDPrice = 30;
		CalculateStockPrice calculateStockPrice = new StockD();
		calculateStockPrice = new StockDDecorator(calculateStockPrice, items);
		Integer totalPrice = calculateStockPrice.getTotalPriceByItem();
		assertEquals(totalPrice, stockDDPrice);
	}
	
	@Test
	public void total_price_stock_value_DA()
	{
		List<String> items = Arrays.asList("A");
		Integer stockDAPrice = 65;
		CalculateStockPrice calculateStockPrice = new StockD();
		calculateStockPrice = new StockDDecorator(calculateStockPrice, items);
		Integer totalPrice = calculateStockPrice.getTotalPriceByItem();
		assertEquals(totalPrice, stockDAPrice);
	}
	
	@Test
	public void total_price_stock_value_AB()
	{
		List<String> items = Arrays.asList("B");
		Integer stockABPrice = 80;
		CalculateStockPrice calculateStockPrice = new StockA();
		calculateStockPrice = new StockADecorator(calculateStockPrice, items);
		Integer totalPrice = calculateStockPrice.getTotalPriceByItem();
		assertEquals(totalPrice, stockABPrice);
	}
	
	@Test
	public void total_price_stock_value_ABC()
	{
		List<String> items = Arrays.asList("B","C");
		Integer stockABCPrice = 100;
		CalculateStockPrice calculateStockPrice = new StockA();
		calculateStockPrice = new StockADecorator(calculateStockPrice, items);
		Integer totalPrice = calculateStockPrice.getTotalPriceByItem();
		assertEquals(totalPrice, stockABCPrice);
	}
	
	@Test
	public void total_price_stock_value_BAC()
	{
		List<String> items = Arrays.asList("A","C");
		Integer stockBACPrice = 100;
		CalculateStockPrice calculateStockPrice = new StockB();
		calculateStockPrice = new StockBDecorator(calculateStockPrice, items);
		Integer totalPrice = calculateStockPrice.getTotalPriceByItem();
		assertEquals(totalPrice, stockBACPrice);
	}
	
	@Test
	public void total_price_stock_value_ABCD()
	{
		List<String> items = Arrays.asList("B","C","D");
		Integer stockABCDPrice = 115;
		CalculateStockPrice calculateStockPrice = new StockA();
		calculateStockPrice = new StockADecorator(calculateStockPrice, items);
		Integer totalPrice = calculateStockPrice.getTotalPriceByItem();
		assertEquals(totalPrice, stockABCDPrice);
	}
	
	@Test
	public void total_price_stock_value_CDBA()
	{
		List<String> items = Arrays.asList("D","B","A");
		Integer stockCDBAPrice = 115;
		CalculateStockPrice calculateStockPrice = new StockC();
		calculateStockPrice = new StockCDecorator(calculateStockPrice, items);
		Integer totalPrice = calculateStockPrice.getTotalPriceByItem();
		assertEquals(totalPrice, stockCDBAPrice);
	}
	
	@Test
	public void total_price_stock_value_AAA_discount()
	{
		List<String> items = Arrays.asList("A","A");
		Integer stockAAADicountPrice = 130;
		CalculateStockPrice calculateStockPrice = new StockA();
		calculateStockPrice = new StockADecorator(calculateStockPrice, items);
		Integer totalPrice = calculateStockPrice.getTotalPriceByItem();
		assertEquals(totalPrice, stockAAADicountPrice);
	}
	
	@Test
	public void total_price_stock_value_BB_discount()
	{
		List<String> items = Arrays.asList("B");
		Integer stockBBPrice = 45;
		CalculateStockPrice calculateStockPrice = new StockB();
		calculateStockPrice = new StockBDecorator(calculateStockPrice, items);
		Integer totalPrice = calculateStockPrice.getTotalPriceByItem();
		assertEquals(totalPrice, stockBBPrice);
	}
}
