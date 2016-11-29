package com.prep.rockpaper;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.prep.rockpaper.util.RockPaperUtil;

/*
 * Game for Rock paper scissor 
 * implementation logic for the game
 */
public class RockPaper {

	private String playerOne;
	private String playerTwo;
	private RockPaperUtil rockPaperUtil;

	public RockPaper(String playerOne, String playerTwo, RockPaperUtil rockPaperUtil) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
		this.rockPaperUtil = rockPaperUtil;
	}

	public String checkWinner() {
		List<String> playerEntries = Arrays.asList(playerOne, playerTwo);
		Collections.sort(playerEntries);
		List<String> mappingList = rockPaperUtil.mappingList();
		List<String> result = playerEntries.stream().flatMap(util -> mappingList.stream()).collect(toList());
		return result.get(0);
	}

}
