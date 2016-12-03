package com.prep.rockpaper;

public class NumberToWordsConvertor {

	public String getWordsForNumber(Integer i) {
		if (i.equals(0)) {
			return "Zero";
		} else {
			return "One";
		}
	}

}
