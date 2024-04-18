package exception;

public class E002_compiletimeExample {
	public static void main(String[] args) {
		
		
		
		try
		{
			Class.forName("basic.Demo1");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		
	}
}
