package impclasses;

public class I001_StringDemo {
	public static void main(String[] args) {
		
//		//String litteral
//		String str = "Dhara";
//		
//		//object
//		String s = new String("Hello");
//		
//		String str1 =  str.concat("Kothari");
//		System.out.println(str1);
		
		
		String str = new String("Java");
		String str1 = new String("Testing");
		String str2 = new String("Java");
		
		
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str2));
		System.out.println(str==str2);
		
		System.out.println("****************");
		
		String s = "Java";
		String s1 = "Testing";
		String s2 = "Java";
		
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s==s2);
		
		
		
	}
}
