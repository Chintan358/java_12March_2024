package operator;

public class O002_Unary {
	public static void main(String[] args) {
		
		
		//post++ ++pre post-- --pre
		
		int a = 31;
		int b = ++a  - ++a - a-- + a++;
		       
		       
		
		System.out.println(a); 
		System.out.println(b); 
		
		
	}
}
