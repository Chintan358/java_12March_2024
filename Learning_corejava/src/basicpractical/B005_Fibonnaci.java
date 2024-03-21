package basicpractical;

public class B005_Fibonnaci {
	public static void main(String[] args) {
		
		int num = 20;
		
		
		int a = 0;
		int b = 1;
		
		System.out.print(a+" "+b);
		for(int i=1;i<=num;i++)
		{
			// 2 3
			int c = a+b;
			System.out.print(" "+c);
			a = b; //1 1 2
			b = c; //1 2 3
		}
		
		
		
	}
}
