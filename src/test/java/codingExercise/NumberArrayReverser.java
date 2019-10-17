package codingExercise;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class NumberArrayReverser {
	
	public long[] reverse(long[] x) {
		if(x.length < 2) {
			return x;
		}
		int start = 0;
		int end = x.length-1;
		while(start < end + 1) {
			long temp = x[start];
			x[start] = x[end];
			x[end] = temp;
			start ++;
			end --;
		}
		return x;
	}

	@Test
	public void test() {
		Assert.assertTrue(Arrays.equals(reverse(new long[]{1,2,3,4,5}),new long[]{5,4,3,2,1}));
		Assert.assertTrue(Arrays.equals(reverse(new long[]{1}),new long[]{1}));
		Assert.assertTrue(Arrays.equals(reverse(new long[]{10,2,3,4,5}),new long[]{5,4,3,2,10}));
		Assert.assertTrue(Arrays.equals(reverse(new long[]{1,2}),new long[]{2,1}));
	}
}

