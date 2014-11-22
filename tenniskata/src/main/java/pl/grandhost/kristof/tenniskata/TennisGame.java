package pl.grandhost.kristof.tenniskata;

public class TennisGame {

	private Player playerA;
	private Player playerB;
	
	TennisGame(){
		playerA = new Player();
		playerB = new Player();
	}
	
	public String getCurrentScore() {
		String result = "";
		if(playerA.getPoint().equals("deuce")){
			result = "deuce";
		}else{
			result = playerA.getPoint() + " : " + playerB.getPoint();
		}
		return result;
	}

	public void playerAScores() {
		// TODO Auto-generated method stub
		
	}

	public void playerBScores() {
		// TODO Auto-generated method stub
		
	}

}
