package oops;

class Calc
{
	public void print()
	{
		System.out.println("print something...");
	}
	
	public void getName(String name)
	{
		System.out.println("my name is : "+name);
	}
	
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public int square(int a)
	{
		int result = a*a;
		return result;
	}
	
	public void arrayAdd(int a[])
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum+a[i];
		}
		System.out.println("sum is : "+sum);
	}
	
	public int[] revArray(int a[])
	{
		int k[] = new int[a.length];
		int c = 0;
		for(int i=a.length-1;i>=0;i--)
		{
			k[c] = a[i];
			c++;
		}
		
		return k;
	}
	
	public void vararg(int...a)
	{
		for (int i = 0; i < a.length; i++) {
			System.out.println("v : "+a[i]);
		}
	}
	
}

public class O004_MethodManipulation {
	public static void main(String[] args) {
		
		Calc c = new Calc();
		c.print();
		c.getName("dhara");
		c.add(10,50);
		
		int sq =  c.square(10);
		System.out.println(sq);
		
		System.out.println(c.square(20));
		
		
		int a[] = {10,20,30,40,50,60};
		c.arrayAdd(a);
		int b[] = {1,2,3,4,5,6,7};
		c.arrayAdd(b);
		
		int k[] =  c.revArray(b);
		for (int i = 0; i < k.length; i++) {
			System.out.println(k[i]);
		}
		
		
		c.vararg(1,40,50,60,70,80);
		
		
	}
}
