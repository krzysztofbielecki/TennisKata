package pl.grandhost.kristof.tenniskata;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

	private Player a;
	
	@Before
	public void init(){
		a = new Player();
	}
	
	@Test
	public void testing_that_new_player_has_zero_points_after_create() {
		assertTrue(a.getPoint().equals(PointUtil.ZERO));
	}
	
	@Test
	public void testing_setting_of_point_value_to_player_object(){
		a.setPoint(PointUtil.FIFTEN);
		assertTrue(a.getPoint().equals(PointUtil.FIFTEN));
	}

}
