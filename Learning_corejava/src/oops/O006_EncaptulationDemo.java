package oops;

public class O006_EncaptulationDemo {
	public static void main(String[] args) {
		
		
		Emp e = new Emp();
		e.setId(10);
		e.setName("Tech");
		e.setEmail("tech@gmail.com");
	
		System.out.println(e.getId()+" "+e.getName()+" "+e.getEmail());
		
	}
}
