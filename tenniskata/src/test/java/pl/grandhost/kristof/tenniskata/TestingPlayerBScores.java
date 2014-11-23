package pl.grandhost.kristof.tenniskata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestingPlayerBScores {

	private TennisGame tg;

	@Before
	public void init(){
		tg = new TennisGame();
		tg.playerBScores();
	}
	
	@Test 
	public void one_point_opponent_none(){
		assertTrue("0 : 15".equals(tg.getCurrentScore()));
	}
	
	@Test 
	public void two_points_opponent_none(){
		tg.playerBScores();
		assertTrue("0 : 30".equals(tg.getCurrentScore()));
	}
	
	@Test 
	public void three_points_opponent_none(){
		tg.playerBScores();
		tg.playerBScores();
		assertTrue("0 : 40".equals(tg.getCurrentScore()));
	}
	
	@Test
	public void four_points_opponent_none(){
		tg.playerBScores();
		tg.playerBScores();
		tg.playerBScores();
		assertTrue("- : W".equals(tg.getCurrentScore()));
	}

}
