package pl.grandhost.kristof.tenniskata;

public class PointUtil {
	
	public static String ZERO = "0";
	public static String FIFTEN = "15";
	public static String THIRTY = "30";
	public static String FORTY = "40";
	public static String DEUCE = "deuce";
	public static String ADVANTAGE = "A";
	public static String WIN = "W";
	public static String EMPTY = "-";

	public static String getNextPoint(String point) {
		if(point.equals(ZERO)){
			return FIFTEN;
		}else if(point.equals(FIFTEN)){
			return THIRTY;
		}else {
			return FORTY;
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
		
		if(playerThatWinTheBall.getPoint().equals(ADVANTAGE) || 
				playerThatWinTheBall.getPoint().equals(FORTY)){
			playerThatWinTheBall.setPoint(WIN);
			playerThatLoseTheBall.setPoint(EMPTY);
		}else if(playerThatWinTheBall.getPoint().equals(THIRTY) &&
			playerThatLoseTheBall.getPoint().equals(FORTY)){
				playerThatWinTheBall.setPoint(DEUCE);
				playerThatLoseTheBall.setPoint(DEUCE);
		}else if(playerThatWinTheBall.getPoint().equals(DEUCE)||
				playerThatWinTheBall.getPoint().equals(EMPTY)){
			if(playerThatLoseTheBall.getPoint().equals(ADVANTAGE)){
				playerThatWinTheBall.setPoint(DEUCE);
				playerThatLoseTheBall.setPoint(DEUCE);
			}else{
				playerThatWinTheBall.setPoint(ADVANTAGE);
				playerThatLoseTheBall.setPoint(EMPTY);
			}
		}else{
			playerThatWinTheBall.setPoint(getNextPoint(playerThatWinTheBall.getPoint()));
		}
	}

}
