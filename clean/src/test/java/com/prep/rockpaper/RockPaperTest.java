package com.prep.rockpaper;

import org.junit.Test;

import com.prep.rockpaper.config.RockPaperConstants;
import com.prep.rockpaper.util.RockPaperUtil;

import static org.junit.Assert.assertEquals;

import java.util.List;


public class RockPaperTest {
	
	private RockPaper rockPaper;
	RockPaperUtil rockPaperUtil = new RockPaperUtil();
	
	@Test
	public void rockWins(){
		rockPaper = new RockPaper(RockPaperConstants.ROCK,RockPaperConstants.PAPER,rockPaperUtil);
		String winner = rockPaper.checkWinner();
		assertEquals(winner, RockPaperConstants.ROCK);
	}
	
	@Test
	public void scissorWins(){
		rockPaper = new RockPaper(RockPaperConstants.SCISSOR,RockPaperConstants.PAPER,rockPaperUtil);
		String winner = rockPaper.checkWinner();
		assertEquals(winner, RockPaperConstants.SCISSOR);
	}
	
	@Test
	public void tie(){
		rockPaper = new RockPaper(RockPaperConstants.SCISSOR,RockPaperConstants.SCISSOR,rockPaperUtil);
		String winner = rockPaper.checkWinner();
		assertEquals(winner, RockPaperConstants.TIE);
	}
}
