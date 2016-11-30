package com.prep.perfectnumber;

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
}
