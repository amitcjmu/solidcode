package com.prep.rockpaper;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NumberToWordsTest {

	@Test
	public void should_convert_0_to_word() {
		NumberToWordsConvertor convertor = new NumberToWordsConvertor();
		assertEquals("Zero", convertor.getWordsForNumber(0));
	}
	
	@Test
	public void should_convert_1_to_word() {
		NumberToWordsConvertor convertor = new NumberToWordsConvertor();
		assertEquals("One", convertor.getWordsForNumber(1));

	}
}
