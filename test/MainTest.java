import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Alex Ryzhkov
 */
public class MainTest {

	@Test
	@DisplayName("Should show the sum of two positive numbers")
	public void testSumPositiveNum(){
		int sum = Main.sum(1, 2);
		assertEquals(4, sum);
	}

	@Test
	@DisplayName("Should show sum of two negative numbers")
	public void testSumTwoNegative(){
		int sum = Main.sum(-12, -2);
		assertEquals(-14, sum);
		assertNotEquals(0, sum);
	}

	@Test
	@DisplayName("Should show sum of a negative and positive number")
	public void testSumPosAndNeg(){
		int sum = Main.sum(-1, 2);
		assertEquals(1, sum);
		assertTrue(1 == sum);
	}

	@Test
	@DisplayName("Should show sum of zero and negative number")
	public void testSumZero(){
		int sum = Main.sum(0, -123);
		assertEquals(-123, sum);
	}
}
