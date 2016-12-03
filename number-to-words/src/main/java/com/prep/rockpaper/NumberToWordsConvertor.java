package com.prep.rockpaper;

import java.util.ArrayList;
import java.util.List;

public class NumberToWordsConvertor {
	String one[] = { " ","one", " two", "three", "four", "five", " " + "six", "seven", "eight", "nine",
			"ten", "eleven", "twelve", " " + "thirteen", "fourteen", "fifteen", " sixteen", "seventeen",
			"eighteen", "nineteen" };

	String ten[] = { " ", " ", " twenty", " thirty", " forty", " fifty", " sixty", "seventy", " eighty",
			" ninety" };
	
	List<String> map = new ArrayList<String>(); 

	public String getWordsForNumber(Integer number) {
		Integer listIndexZero = 0;
		Integer modulasValue = 100;
		
		List<String> map = numberToWord((number % modulasValue), " ");
		
		return map.get(listIndexZero);
	}
	
	public List<String> numberToWord(Integer number, String word) {
		
		
		if (number > 19) {
			map.add(ten[number / 10] + " " + one[number % 10]);
		} else {
			map.add(one[number]);
		}

		if (number > 0)
			map.add(word);

		return map;
	}

}
