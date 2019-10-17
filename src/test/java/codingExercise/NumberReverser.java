package codingExercise;

import org.junit.Assert;
import org.junit.Test;

public class NumberReverser {
	
	public long reverse(long x) {
		long reverseX = 0;
		while(x > 0) {
			reverseX = reverseX*10 + x%10;
			x = x/10;
		}
		return reverseX;
	}

	@Test
	public void test() {
		Assert.assertTrue(reverse(0) == 0);
		Assert.assertTrue(reverse(1) == 1);
		Assert.assertTrue(reverse(10) == 1);
		Assert.assertTrue(reverse(100) == 1);
		Assert.assertTrue(reverse(101) == 101);
		Assert.assertTrue(reverse(102) == 201);
		Assert.assertTrue(reverse(102030405) == 504030201);
	}
}

