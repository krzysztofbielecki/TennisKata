package pl.grandhost.kristof.tenniskata;

import java.util.ArrayList;
import java.util.Random;

public class TennisGame {

	private Player playerA;
	private Player playerB;
	
	public TennisGame(){
		playerA = new Player();
		playerB = new Player();
	}
	
	/**
	 * Returns current game score
	 * @return
	 */
	public String getCurrentScore() {
		String result = "";
		if(playerA.getPoint().equals("deuce")){
			result = "deuce";
		}else{
			result = playerA.getPoint() + " : " + playerB.getPoint();
		}
		return result;
	}
	
	/**
	 * Increase player A score
	 */
	public void playerAScores() {
		PointUtil.addPoint(playerA, playerB);
	}
	
	/**
	 * Increase player B score 
	 */
	public void playerBScores() {
		PointUtil.addPoint(playerB, playerA);
	}
	

	public ArrayList<String> playTheGame() {
		boolean stillPlaying = true;
		ArrayList<String> result = new ArrayList<String>();
		TennisGame tg = new TennisGame();
		while(stillPlaying){
			result.add(tg.getCurrentScore());
			Random r = new Random();
			if(r.nextBoolean()){
				tg.playerAScores();
			}else{
				tg.playerBScores();
			}
			if(tg.getCurrentScore().contains("W")){
				result.add(tg.getCurrentScore());
				stillPlaying = false;
			}
		}
		return result;
	}

}
