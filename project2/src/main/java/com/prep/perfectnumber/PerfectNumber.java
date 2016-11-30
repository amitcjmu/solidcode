package com.prep.perfectnumber;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class PerfectNumber {
	
	public Boolean findPerfectNumber(Integer number) {
		return isPerfectNumber(number);
	}
	
	public Boolean isPerfectNumber(Integer number) {
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0)
				sum = sum + i;
		}
		if (number == sum)
			return true;

		return false;
	}
	
	public static final int[] factors(Integer factorsOf) {
	    return IntStream.rangeClosed(1, factorsOf)
	            .filter(f -> factorsOf % f == 0)
	            .toArray();
	}
}
