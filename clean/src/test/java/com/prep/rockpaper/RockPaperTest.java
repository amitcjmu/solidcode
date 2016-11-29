package com.prep.rockpaper;

import org.junit.Test;

import com.prep.rockpaper.config.RockPaperConstants;

import static org.junit.Assert.assertEquals;

import java.util.List;


public class RockPaperTest {
	
	private RockPaper rockPaper;
	
	@Test
	public void rockWins(){
		rockPaper = new RockPaper(RockPaperConstants.ROCK,RockPaperConstants.PAPER);
		String winner = rockPaper.checkWinner();
		assertEquals(winner, RockPaperConstants.ROCK);
	}
	
	@Test
	public void scissorWins(){
		rockPaper = new RockPaper(RockPaperConstants.SCISSOR,RockPaperConstants.PAPER);
		String winner = rockPaper.checkWinner();
		assertEquals(winner, RockPaperConstants.SCISSOR);
	}
	
	@Test
	public void tie(){
		rockPaper = new RockPaper(RockPaperConstants.SCISSOR,RockPaperConstants.SCISSOR);
		String winner = rockPaper.checkWinner();
		assertEquals(winner, RockPaperConstants.TIE);
	}
}
