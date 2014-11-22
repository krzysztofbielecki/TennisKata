package pl.grandhost.kristof.tenniskata;

import static org.junit.Assert.*;

import java.util.ArrayList;

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
	
	@Test
	public void testing_playerAScores_method_till_winning_the_game(){
		TennisGame tg = new TennisGame();
		tg.playerAScores();
		assertTrue("15 : 0".equals(tg.getCurrentScore()));
		tg.playerAScores();
		assertTrue("30 : 0".equals(tg.getCurrentScore()));
		tg.playerAScores();
		assertTrue("40 : 0".equals(tg.getCurrentScore()));
		tg.playerAScores();
		assertTrue("W : -".equals(tg.getCurrentScore()));
	}
	
	@Test
	public void testing_playerBScores_method_till_winning_the_game(){
		TennisGame tg = new TennisGame();
		tg.playerBScores();
		assertTrue("0 : 15".equals(tg.getCurrentScore()));
		tg.playerBScores();
		assertTrue("0 : 30".equals(tg.getCurrentScore()));
		tg.playerBScores();
		assertTrue("0 : 40".equals(tg.getCurrentScore()));
		tg.playerBScores();
		assertTrue("- : W".equals(tg.getCurrentScore()));
	}
	
	@Test
	public void testing_deuce_from_30_40(){
		TennisGame tg = new TennisGame();
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
		TennisGame tg = new TennisGame();
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
		TennisGame tg = new TennisGame();
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
		TennisGame tg = new TennisGame();
		ArrayList<String> tgResult = tg.playTheGame();
		assertTrue(tgResult.get(tgResult.size() - 1 ).equals("W : -")||
				tgResult.get(tgResult.size() - 1).equals("- : W"));
	}

}
