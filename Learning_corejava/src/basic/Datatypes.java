package basic;

import oops.Access;

public class Datatypes {
	public static void main(String[] args) {

//		byte b = -128;
//		short s = -32768;
//		int i = 20000;
//		long l = 565656565;
//
//		float f = 56.66656565f;
//		double d = 5656.5656454564;
//
//		char ch = 'a';
//
//		boolean bool = false;

//		System.out.println(f);
//		System.out.println(d);
		
		//widening - implicite
		int a = 10;  //4
		long b = a;  //8
		
		//nerrowing - explicite
		long i  = 145;
		int j = (int) i;
		

//		System.out.println(b);
//		System.out.println(j);
		
		
		int k = 'd';
		System.out.println(k);
		
		char c = 35;
		System.out.println(c);
		
		
	}
}
