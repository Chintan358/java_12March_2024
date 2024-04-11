package oops;

interface I1
{
	public void print();
}

class InterImpl implements I1
{

	@Override
	public void print() {
		System.out.println("prin calling");
		
	}
	
}


public class O012_InterfaceDemo {
	public static void main(String[] args) {
		
		InterImpl i = new InterImpl();
		i.print();
	}
}
