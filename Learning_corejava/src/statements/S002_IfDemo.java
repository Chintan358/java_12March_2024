package statements;

public class S002_IfDemo {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 200;
		int c = 500;
		
		
//		if(a>b)
//		{
//			if(a>c)
//			{
//				System.out.println("a is greater");
//			}
//			else
//			{
//				System.out.println("c is greater");
//			}
//			
//		}
//		else
//		{
//			if(b>c)
//			{
//			System.out.println("b is greter");
//			}
//			else
//			{
//				System.out.println("c is greater");
//			}
//			
//		}
//		
		
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else if(c>a && c>b)
		{
			System.out.println("C is greater");
		}
		
		
		
		
		
		
		
	}
}
