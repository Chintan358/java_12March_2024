package oops;

class P
{
	public void display()
	{
		System.out.println("running display of class P");
	}
}

class Q extends P
{
	@Override
	public void display() {
		System.out.println("running display of class Q");
	}
}

public class O010_MethodOverriding {
	public static void main(String[] args) {
		
		
		Q q = new Q();
		q.display();
		
	}
}
