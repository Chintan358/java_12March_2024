package impclasses;

class sample
{
	int id = 10;
	
	@Override
	public String toString() {
		
		return "dhara"+id;
	}
}

class Demo extends sample
{
	
}

public class I004_ObjectClass {
	public static void main(String[] args) {
		
		sample s = new sample();
		System.out.println(s);
	
	}
}
