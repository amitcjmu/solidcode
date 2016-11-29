package com.prep.rockpaper.util;

import java.util.ArrayList;
import java.util.List;

import com.prep.rockpaper.config.RockPaperConstants;

public class RockPaperUtil {

	
	public List<String> mappingList() {
		List<String> mapping = new ArrayList<String>();
		String resultOne = RockPaperConstants.PAPER + RockPaperConstants.ROCK;
		mapping.add(resultOne);
	    return mapping;	
	}
}
