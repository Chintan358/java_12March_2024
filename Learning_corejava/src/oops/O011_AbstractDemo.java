package oops;

abstract class Abs
{
	abstract public void display();
	
	public void show()
	{
		System.out.println("calling show");
	}
}

class AbsImpl extends Abs
{

	@Override
	public void display() {
		System.out.println("display calling..");
	}
	
}

public class O011_AbstractDemo {
	public static void main(String[] args) {
		
//		Abs ab  =new Abs(); - not possible
		
		AbsImpl imp = new AbsImpl();
		imp.display();
		
	}
}
