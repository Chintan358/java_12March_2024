package listener;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class MyTest {
	
	@Test
	public void alpha()
	{
		System.out.println("running alpha test");
	}
	
	@Test
	public void beta()
	{
		
		System.out.println("running beta test");
		assertTrue(false);
	}
}
