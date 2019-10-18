package codingExercise;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class NumberArraySorter {
	
	public long[] sort(long[] x) {
		int length = x.length;
		if(length < 2) {
			return x;
		}
		long temp = 0;
		for(int i = 0; i < length; i++) {
			for(int j = i+1; j < length; j++) {
				if(x[i] > x[j]) {
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		return x;
	}

	@Test
	public void test() {
		Assert.assertTrue(Arrays.equals(sort(new long[]{3,1,2,5,4}),new long[]{1,2,3,4,5}));
		Assert.assertTrue(Arrays.equals(sort(new long[]{1}),new long[]{1}));
		Assert.assertTrue(Arrays.equals(sort(new long[]{10,2,3,4,5}),new long[]{2,3,4,5,10}));
		Assert.assertTrue(Arrays.equals(sort(new long[]{11,2}),new long[]{2,11}));
	}
}

