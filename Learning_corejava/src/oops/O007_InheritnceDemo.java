
package oops;

//super, parent, base
class A
{
	int id = 10;
	public void display()
	{
		System.out.println("runing class a display");
	}
}

//sub, child, deraived
class B extends A
{
	int id = 50;
	public void show()
	{
		int id = 500;
		System.out.println(id);
		System.out.println(this.id);
		System.out.println(super.id);
	}
}

class C extends A
{
	
}

public class O007_InheritnceDemo {
	public static void main(String[] args) {
		
		B b = new B();
		b.show();
		
//		A a = new A();
//		a.display();
		
	}
}
