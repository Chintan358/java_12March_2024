package array;

public class A004_ArrayOpration {
	public static void main(String[] args) {
		
		
//		int a[] = {10,20,30,40,50,60};
//		
//		int b[] = new int[a.length];
//		
//		System.arraycopy(a, 1, b, 1, 4);
//		
//		for (int i = 0; i < b.length; i++) {
//			System.out.println(b[i]);
//		}
		
		
		int a[] = {10,20,30,40,50,60};
		int b[] = {1,2,3,4,5};
		int c[] = new int[a.length+b.length];
		
		
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		
		for (int i = 0; i < b.length; i++) {
			c[a.length+i] = b[i];
		}
		
		
		
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
		
	}
}
