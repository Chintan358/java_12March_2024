package oops;

//super, parent, base
class A
{
	int a = 10;
	public void display()
	{
		System.out.println("runing class a display");
	}
}

//sub, child, deraived
class B extends A
{
	public void show()
	{
		System.out.println(a);
	}
}

public class O007_InheritnceDemo {
	public static void main(String[] args) {
		
		B b = new B();
		b.display();
		b.show();
		
		A a = new A();
		a.display();
		
	}
}
