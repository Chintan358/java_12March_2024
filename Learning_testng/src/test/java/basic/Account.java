package basic;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Account {
	
	@Test
	public void savingAccount()
	{
		System.out.println("Saving account..");
		assertTrue(false);
	}
	
	@Test
	public void loanAccount()
	{
		System.out.println("Loan Account");
	}
	
	@Test(groups ={"smoke","sanity"})
	public void currentAccount()
	{
		System.out.println("Current Account");
	}
}
