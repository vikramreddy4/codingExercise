package codingExercise;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class NumberFinderInArray {
	
	public boolean find(long[] x, long y) {
		return binaryFind(sort(x), y);
	}

	public boolean binaryFind(long[] x, long y) {
		int start = 0;
		int end = x.length - 1;
		if(y == x[start] || y == x[end]) {
			return true;
		}
		int middle = (start + end) / 2;
		if(y == x[middle]) {
			return true;
		}
		if(y > x[middle]) {
			start = middle;
		}
		end = middle;
		x = Arrays.copyOfRange(x, start, end);
		return binaryFind(x,y);
	}
	
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
		Assert.assertTrue(find(new long[]{3,1,2,5,4},3));
		Assert.assertFalse(find(new long[]{31,21,12,50,4},3));
		Assert.assertTrue(find(new long[]{30,10,2,5,4},4));
		Assert.assertTrue(find(new long[]{3,1,2,2,2,2,2,2,5,4},3));
	}
}

