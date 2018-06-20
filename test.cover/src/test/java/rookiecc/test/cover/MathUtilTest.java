package rookiecc.test.cover;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathUtilTest {
	
	private MathUtil mu = new MathUtil();
	@Test
	public void test_max_1_2_3() {
		assertEquals(3, mu.max(1, 2, 3));
	}

	@Test
	public void test_max_10_20_30() {
		assertEquals(30, mu.max(10, 20, 30));
	}

	@Test
	public void test_max_100_200_300() {
		assertEquals(300, mu.max(100, 200, 300));
	}

	@Test
	public void test_max_2_1_3() {
		assertEquals(3, mu.max(2, 1, 3));
	}

	@Test
	public void test_max_3_2_1() {
		assertEquals(3, mu.max(3, 2, 1));
	}

	@Test
	public void test_max_1_3_2() {
		assertEquals(3, mu.max(1, 3, 2));
	}
}
