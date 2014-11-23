package pl.grandhost.kristof.tenniskata;

import static org.junit.Assert.*;

import org.junit.Test;

public class PointUtilTest {

	@Test
	public void check_next_point_after_0() {
		Player a = new Player();
		a.setPoint(PointUtil.getNextPoint(a.getPoint()));
		assertTrue(PointUtil.FIFTEN.equals(a.getPoint()));
	}
	
	@Test
	public void check_next_point_after_15() {
		Player a = new Player();
		a.setPoint(PointUtil.getNextPoint(a.getPoint()));
		a.setPoint(PointUtil.getNextPoint(a.getPoint()));
		assertTrue(PointUtil.THIRTY.equals(a.getPoint()));
	}
	
	@Test
	public void check_next_point_after_30() {
		Player a = new Player();
		a.setPoint(PointUtil.getNextPoint(a.getPoint()));
		a.setPoint(PointUtil.getNextPoint(a.getPoint()));
		a.setPoint(PointUtil.getNextPoint(a.getPoint()));
		assertTrue(PointUtil.FORTY.equals(a.getPoint()));
	}

}
