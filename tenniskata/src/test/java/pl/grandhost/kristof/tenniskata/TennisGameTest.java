package pl.grandhost.kristof.tenniskata;

import static org.junit.Assert.*;

import org.junit.Test;

public class TennisGameTest {

	@Test
	public void testing_get_current_score_method_after_starting_the_game() {
		TennisGame tg = new TennisGame();
		assertTrue("0 : 0".equals(tg.getCurrentScore()));
	}
	
	@Test
	public void testing_get_current_score_method_after_starting_the_game_and_point_won_by_player_a() {
		TennisGame tg = new TennisGame();
		tg.playerAScores();
		assertTrue("15 : 0".equals(tg.getCurrentScore()));
	}
	
	@Test
	public void testing_get_current_score_method_after_starting_the_game_and_point_won_by_player_b() {
		TennisGame tg = new TennisGame();
		tg.playerBScores();
		assertTrue("0 : 15".equals(tg.getCurrentScore()));
	}

}
