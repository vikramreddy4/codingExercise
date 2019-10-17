import org.codehaus.jackson.annotate.JsonUnwrapped;
import org.springframework.util.Assert;

public class NumberTester {
	
	public long reverse(long x) {
		int reverseX = 0;
		while(x > 0) {
			reverseX = reverseX*10 + x%10;
			x = x/10;
		}
		return reverseX;
	}

	public void test() {
		Assert.isTrue(NumberTester.reverse(10) == 1);
	}
}
