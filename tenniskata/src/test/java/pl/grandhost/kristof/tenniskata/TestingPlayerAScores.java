package pl.grandhost.kristof.tenniskata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestingPlayerAScores {

	private TennisGame tg;

	@Before
	public void init(){
		tg = new TennisGame();
		tg.playerAScores();
	}
	
	@Test 
	public void one_point_opponent_none(){
		assertTrue("15 : 0".equals(tg.getCurrentScore()));
	}
	
	@Test 
	public void two_points_opponent_none(){
		tg.playerAScores();
		assertTrue("30 : 0".equals(tg.getCurrentScore()));
	}
	
	@Test 
	public void three_points_opponent_none(){
		tg.playerAScores();
		tg.playerAScores();
		assertTrue("40 : 0".equals(tg.getCurrentScore()));
	}
	
	@Test
	public void four_points_opponent_none(){
		tg.playerAScores();
		tg.playerAScores();
		tg.playerAScores();
		assertTrue("W : -".equals(tg.getCurrentScore()));
	}

}
