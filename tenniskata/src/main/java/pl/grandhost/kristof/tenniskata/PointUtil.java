package pl.grandhost.kristof.tenniskata;

public class PointUtil {

	public static String getNextPoint(String point) {
		if(point.equals("0")){
			return "15";
		}else if(point.equals("15")){
			return "30";
		}else {
			return "40";
		}
	}
	
	/**
	 * First Player object that is sent to the method wins the ball
	 * and his score is increased 
	 * 
	 * @param playerThatWinTheBall
	 * @param playerThatLoseTheBall
	 */
	public static void addPoint(Player playerThatWinTheBall, Player playerThatLoseTheBall){
		
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
			playerThatWinTheBall.setPoint(getNextPoint(playerThatWinTheBall.getPoint()));
		}
	}

}
