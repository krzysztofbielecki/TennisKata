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
		addPoint(playerA, playerB);
	}
	
	/**
	 * Increase player B score 
	 */
	public void playerBScores() {
		addPoint(playerB, playerA);
	}
	
	/**
	 * First Player object that is sent to the method wins the ball
	 * and his score is increased 
	 * 
	 * @param playerThatWinTheBall
	 * @param playerThatLoseTheBall
	 */
	private void addPoint(Player playerThatWinTheBall, Player playerThatLoseTheBall){
		
		if(playerThatWinTheBall.getPoint().equals("A") || 
				playerThatWinTheBall.getPoint().equals("40")){
			playerThatWinTheBall.setPoint("W");
			playerThatLoseTheBall.setPoint("-");
		}else if(playerThatWinTheBall.getPoint().equals("30") &&
			playerThatLoseTheBall.getPoint().equals("40")){
				playerThatWinTheBall.setPoint("deuce");
				playerThatLoseTheBall.setPoint("deuce");
		}else if(playerThatWinTheBall.getPoint().equals("deuce")||
				playerThatWinTheBall.getPoint().equals("-")){
			if(playerThatLoseTheBall.getPoint().equals("A")){
				playerThatWinTheBall.setPoint("deuce");
				playerThatLoseTheBall.setPoint("deuce");
			}else{
				playerThatWinTheBall.setPoint("A");
				playerThatLoseTheBall.setPoint("-");
			}
		}else{
			String point = playerThatWinTheBall.getPoint();
			if(point.equals("0")){
				playerThatWinTheBall.setPoint("15");
			}else if(point.equals("15")){
				playerThatWinTheBall.setPoint("30");
			}else {
				playerThatWinTheBall.setPoint("40");
			}
		}
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
