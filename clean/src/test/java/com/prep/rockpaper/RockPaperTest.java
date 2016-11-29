package com.prep.rockpaper;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.List;


public class RockPaperTest {
	
	private RockPaper rockPaper;
	
	@Test
	public void rockWins(){
		rockPaper = new RockPaper("ROCK","PAPER");
		String winner = rockPaper.checkWinner;
		assertEquals(winner, "ROCK");
	}
}
