import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathsTest {

	Maths math = new Maths();
	int x;
	int y;
	
	@Before
	public void setUp() throws Exception {
		x=0;
		y=0;
	}

	@After
	public void tearDown() throws Exception {
		x=0;
		y=0;
	}

	@Test
	public void testAddition() {
		assertEquals(25, math.addition(10, 15));
	}

	@Test
	public void testSubs() {
		assertEquals(15, math.subs(30, 15));
	}

}
