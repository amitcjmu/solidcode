package com.prep.rockpaper;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NumberToWordsTest {

	@Test
	public void should_convert_0_to_word() {
		NumberToWordsConvertor convertor = new NumberTWordsConvertor();
		assertEquals("Zero", convertor.getWordsForNumber(0));

	}
}
