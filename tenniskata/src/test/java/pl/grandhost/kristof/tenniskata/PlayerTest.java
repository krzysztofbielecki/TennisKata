package pl.grandhost.kristof.tenniskata;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void testing_that_new_player_has_zero_points_after_create() {
		Player a = new Player();
		assertTrue(a.getPoint().equals("0"));
	}
	
	@Test
	public void testing_setting_of_point_value_to_player_object(){
		Player a = new Player();
		a.setPoint("15");
		assertTrue(a.getPoint().equals("15"));
	}

}
