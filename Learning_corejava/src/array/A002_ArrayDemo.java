package array;

import java.util.Scanner;

public class A002_ArrayDemo {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array :  ");
		int size =  sc.nextInt();
	
//		int a[] = new int[size];
//		
//		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println("enter value for index : "+i);
//			a[i] = sc.nextInt();
//		}
//		
//		System.out.println("*************************");
//		
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		
		
		String sub[] = new String[size];
		
		for (int i = 0; i < sub.length; i++) {
			System.out.println("enter subject for index : "+(i+1));
			sub[i] = sc.next();
		}
		
		
		for (int i = 0; i < sub.length; i++) {
			System.out.println(sub[i]);
		}
		
	}
}
