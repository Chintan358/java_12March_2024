package array;

public class A001_arrayDemo {
	public static void main(String[] args) {
		
//		int a[] = new int[10];
//		
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;
//		a[3] = 40;
//		a[4] = 50;
//		a[5] = 60;
//		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
//	
		
		
		int[] a = {10,20,30,40,50,50,60,70};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("*******************");
		
		String sub[] = {"java","php","python","android"};
		for (int i = 0; i < sub.length; i++) {
			System.out.println(sub[i]);
		}
		
		
		System.out.println("********************");

		char ch[] = {'A','B','C','D'};
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		
		
		
	}
}
