package pl.grandhost.kristof.tenniskata;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TennisGameTest {

	private TennisGame tg;
	
	@Before
	public void init(){
		tg = new TennisGame();
	}
	
	@Test
	public void testing_get_current_score_method_after_starting_the_game() {
		assertTrue("0 : 0".equals(tg.getCurrentScore()));
	}
	
	@Test
	public void testing_deuce_from_30_40(){
		tg.playerBScores();
		tg.playerBScores();
		tg.playerBScores();
		tg.playerAScores();
		tg.playerAScores();
		tg.playerAScores();
		assertTrue("deuce".equals(tg.getCurrentScore()));
	}
	
	@Test
	public void testing_advantage(){
		tg.playerBScores();
		tg.playerBScores();
		tg.playerBScores();
		tg.playerAScores();
		tg.playerAScores();
		tg.playerAScores();
		tg.playerAScores();
		assertTrue("A : -".equals(tg.getCurrentScore()));
	}
	
	@Test
	public void testing_return_to_deuce_from_player_b_advantage(){
		tg.playerBScores();
		tg.playerBScores();
		tg.playerBScores();
		tg.playerAScores();
		tg.playerAScores();
		tg.playerAScores();
		tg.playerBScores();
		tg.playerAScores();
		assertTrue("deuce".equals(tg.getCurrentScore()));
	}
	
	@Test
	public void testing_that_after_game_simulation_there_is_a_winer(){
		ArrayList<String> tgResult = tg.playTheGame();
		assertTrue(tgResult.get(tgResult.size() - 1 ).equals("W : -")||
				tgResult.get(tgResult.size() - 1).equals("- : W"));
	}

}
