package _02_gotta_catchem_all;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ExceptionMethods {
	public static double divide(double i, double x) {
		double q = 0;
		if (x==0.0) {
			throw new IllegalArgumentException();
		}else {
			q=i/x;
		}
		return q;
		
	}
	public static String reverseString(String x) {
		String reverse="";
		if(x=="") {
			throw new IllegalStateException();

		}else {
		for (int i = x.length(); i > 0 ; i--) {
		reverse=reverse+ x.charAt(i)+"";
		}
		}
		return reverse;
	}
}
