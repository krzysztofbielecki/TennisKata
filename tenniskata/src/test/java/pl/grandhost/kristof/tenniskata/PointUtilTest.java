package pl.grandhost.kristof.tenniskata;

import static org.junit.Assert.*;

import org.junit.Test;

public class PointUtilTest {

	@Test
	public void check_next_point_after_0() {
		Player a = new Player();
		assertTrue("15".equals(PointUtil.getNextPoint(a.getPoint())));
	}
	
	@Test
	public void check_next_point_after_15() {
		Player a = new Player();
		assertTrue("15".equals(PointUtil.getNextPoint(a.getPoint())));
	}
	
	@Test
	public void check_next_point_after_30() {
		Player a = new Player();
		assertTrue("40".equals(PointUtil.getNextPoint(a.getPoint())));
	}

}
