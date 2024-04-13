package impclasses;

public class I002_StringMethods {
	public static void main(String[] args) {
		
		String str = "Sun rises in east";
		
		
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.charAt(10));
		System.out.println(str.indexOf('s'));
		System.out.println(str.endsWith("st"));
		System.out.println(str.startsWith("x"));
		System.out.println(str.replace('s','y'));
		System.out.println(str.substring(5,8));
		System.out.println(str.concat("hello"));
		
		System.out.println("************************");
		
		String words[] =  str.split(" ");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		
		System.out.println("********************");
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println("***************");
		byte b[] = str.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
	}
}
