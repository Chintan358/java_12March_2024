package basic;

import org.testng.annotations.Test;

public class MyApp {
	
	@Test(groups ="smoke")
	public void login()
	{
		System.out.println("running login test");
	}
	
	@Test(groups = "sanity")
	public void home()
	{
		System.out.println("running home test");
	}
	
	@Test
	public void logout()
	{
		System.out.println("Logout test");
	}
	
}
