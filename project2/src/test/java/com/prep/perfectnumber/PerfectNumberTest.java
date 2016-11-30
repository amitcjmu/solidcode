package com.prep.perfectnumber;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PerfectNumberTest {

	PerfectNumber perfectNumber = new PerfectNumber();

	@Test
	public void testPerfectNumber() {
		Integer number = 6;
		perfectNumber.findPerfectNumber(6);
	}
}
