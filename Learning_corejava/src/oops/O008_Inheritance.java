package oops;

class Pen1
{
	int price=10;
	String color="blue";
	String company="ss";
	
	public void info()
	{
		System.out.println(price+" "+color+" "+company);
	}
}

class Book extends Pen1
{
	int pages = 100;
	public void info()
	{
		System.out.println(price+" "+color+" "+company+" "+pages);
	}
}


public class O008_Inheritance {
	public static void main(String[] args) {
		
		
		Pen1 p1 = new Pen1();
		p1.info();
		
	}
}
