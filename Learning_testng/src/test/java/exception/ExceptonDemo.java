package exception;

import org.testng.annotations.Test;

public class ExceptonDemo {

	@Test(expectedExceptions = ArithmeticException.class)
	public void test()
	{
		int a = 10;
		int b = a/0;
	}
	
	@Test(expectedExceptions = Exception.class)
	public void demo()
	{
		int a[] = new int[5];
		a[5] = 50;
	}
}
