package basicpractical;

public class B003_Primecheck2 {
	public static void main(String[] args) {
		
		for(int j = 3 ; j<=100;j++)
		{
		
		int num = j;
		int flag = 0;
		
		for(int i=2; i<num;i++)
		{
			//2 3 4 5 6 7 8 9 10 11 12
			if(num%i==0)
			{
				flag = 1;
				break;
			}
		}
		
		if(flag==1)
		{
			//System.out.println(num+" : Numer is not prime");
		}
		else
		{
			System.out.println(num+ " : Number is prime");
		}
		
		}
	}
}
