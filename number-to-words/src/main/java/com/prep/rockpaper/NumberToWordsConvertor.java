package com.prep.rockpaper;

import java.util.ArrayList;
import java.util.List;

public class NumberToWordsConvertor {
	String one[] = { "zero", "one", "two", "three", "four", "five", " " + "six", "seven", "eight", "nine",
			"ten", "eleven", "twelve", " " + "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
			"eighteen", "nineteen"};
	List<String> map = new ArrayList<String>(); 

	public String getWordsForNumber(Integer number) {
		Integer listIndexZero = 0;
		Integer modulasValue = 100;
		
		List<String> map = numberToWord((number % modulasValue), " ");
		
		return map.get(listIndexZero);
	}
	
	public List<String> numberToWord(Integer number, String word) {
		map.add(one[number]);	
		if (number > 0)
			map.add(word);
		
		return map;
	}

}
