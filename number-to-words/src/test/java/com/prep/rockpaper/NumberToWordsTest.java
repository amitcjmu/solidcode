package com.prep.rockpaper;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NumberToWordsTest {

	@Test
	public void should_convert_1_to_word() {
		NumberToWordsConvertor convertor = new NumberToWordsConvertor();
		assertEquals("one", convertor.getWordsForNumber(1).trim());

	}
	
	@Test
	public void should_convert_9_to_word() {
		NumberToWordsConvertor convertor = new NumberToWordsConvertor();
		assertEquals("nine", convertor.getWordsForNumber(9).trim());

	}
	
	@Test
	public void should_convert_10_to_word() {
		NumberToWordsConvertor convertor = new NumberToWordsConvertor();
		assertEquals("ten", convertor.getWordsForNumber(10).trim());

	}
	
	@Test
	public void should_convert_19_to_word() {
		NumberToWordsConvertor convertor = new NumberToWordsConvertor();
		assertEquals("nineteen", convertor.getWordsForNumber(19).trim());

	}
	
	@Test
	public void should_convert_20_to_word() {
		NumberToWordsConvertor convertor = new NumberToWordsConvertor();
		assertEquals("twenty", convertor.getWordsForNumber(20).trim());

	}
	
	@Test
	public void should_convert_25_to_word() {
		NumberToWordsConvertor convertor = new NumberToWordsConvertor();
		assertEquals("twenty five", convertor.getWordsForNumber(25).trim());

	}
	
	@Test
	public void should_convert_55_to_word() {
		NumberToWordsConvertor convertor = new NumberToWordsConvertor();
		assertEquals("fifty five", convertor.getWordsForNumber(55).trim());

	}
}
