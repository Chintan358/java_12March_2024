package oops;

class Pen
{
	static   int price=10;
	String color="red";
	String company="cello";
	
	public void toWrite()
	{
		System.out.println("towrite method calling...");
		System.out.println(price+" "+color+" "+company);
		
	}
	public static void sample()
	{
		System.out.println("Sample calling...");
	}
}

public class O001_MyFirstDemo {
	
	 static public void main(String[] args) {
		
		Pen p1 = new Pen();
		Pen.price=200;
		p1.toWrite();
		
		Pen p2 = new Pen();
		p2.toWrite();
		
		Pen p3 = new Pen();
		p3.toWrite();
		
		Pen.sample();
	
	}
}
