package basicpractical;

public class B004_Factorial {
	public static void main(String[] args) {
		
		
		int num = 10;
		
		
		int fact = 1;
		
		for(int i=1;i<=num;i++)
		{
			fact = fact * i;
		}
		
		System.out.println("Fact of "+num+" is "+fact);
		
		
		
	}
}
