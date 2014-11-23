package pl.grandhost.kristof.tenniskata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PointUtilTest {

	private Player a;
	
	@Before
	public void init(){
		a = new Player();
	}
	
	@Test
	public void check_next_point_after_0() {
		a.setPoint(PointUtil.getNextPoint(a.getPoint()));
		assertTrue(PointUtil.FIFTEN.equals(a.getPoint()));
	}
	
	@Test
	public void check_next_point_after_15() {
		a.setPoint(PointUtil.getNextPoint(a.getPoint()));
		a.setPoint(PointUtil.getNextPoint(a.getPoint()));
		assertTrue(PointUtil.THIRTY.equals(a.getPoint()));
	}
	
	@Test
	public void check_next_point_after_30() {
		a.setPoint(PointUtil.getNextPoint(a.getPoint()));
		a.setPoint(PointUtil.getNextPoint(a.getPoint()));
		a.setPoint(PointUtil.getNextPoint(a.getPoint()));
		assertTrue(PointUtil.FORTY.equals(a.getPoint()));
	}

}
