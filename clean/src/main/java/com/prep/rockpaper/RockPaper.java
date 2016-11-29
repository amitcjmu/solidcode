package com.prep.rockpaper;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/*
 * Game for Rock paper scissor 
 * implementation logic for the game
 */ 
public class RockPaper {

	private String playerOne;
	private String playerTwo;
	
	
	public RockPaper(String playerOne, String playerTwo){
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}
	
	public String checkWinner() {
		List<String> playerEntries = Arrays.asList(playerOne, playerTwo);
		Collections.sort(playerEntries);
		
		return null;
	}
	
}
