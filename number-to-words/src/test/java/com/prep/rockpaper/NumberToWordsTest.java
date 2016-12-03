package com.prep.rockpaper;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NumberToWordsTest {

	@Test
	public void should_convert_0_to_word() {
		NumberToWordsConvertor convertor = new NumberToWordsConvertor();
		assertEquals("zero", convertor.getWordsForNumber(0));
	}
	
	@Test
	public void should_convert_1_to_word() {
		NumberToWordsConvertor convertor = new NumberToWordsConvertor();
		assertEquals("one", convertor.getWordsForNumber(1));

	}
	
	@Test
	public void should_convert_9_to_word() {
		NumberToWordsConvertor convertor = new NumberToWordsConvertor();
		assertEquals("nine", convertor.getWordsForNumber(9));

	}
	
	@Test
	public void should_convert_10_to_word() {
		NumberToWordsConvertor convertor = new NumberToWordsConvertor();
		assertEquals("ten", convertor.getWordsForNumber(10));

	}
	
	@Test
	public void should_convert_19_to_word() {
		NumberToWordsConvertor convertor = new NumberToWordsConvertor();
		assertEquals("nineteen", convertor.getWordsForNumber(19));

	}
}
