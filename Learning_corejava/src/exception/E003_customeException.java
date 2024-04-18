package exception;

class InSufficientFundException extends Exception
{
	
}


class Bank
{
	double balance;
	
	public void checkBalance()
	{
		System.out.println("Your current balance is : "+balance);
	}
	
	public void deposite(double amt)
	{
		balance = balance+amt;
	}
	
	public void withdraw(double amt) throws InSufficientFundException
	{
		if(amt>balance)
		{
			throw new InSufficientFundException();
		}
		else
		{
			balance = balance-amt;
		}
	}
}

public class E003_customeException {
	public static void main(String[] args) {
		
		
		Bank b = new Bank();
		b.checkBalance();
		b.deposite(5000);
		b.deposite(2000);
		b.checkBalance();
		
		try {
			b.withdraw(14000);
		} catch (InSufficientFundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		b.checkBalance();
	}
}
