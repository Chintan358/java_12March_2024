package array;

public class A003_ArrayOprations {
	public static void main(String[] args) {
		
		
		int a[] = {10,20,6,4,5,300,21,300,56,98,12,45,43};	
		int sum = 0;	
		for (int i = 0; i < a.length; i++) {		
			sum += a[i];	
		}
		System.out.println("sum  : "+sum);
		System.out.println("avg : "+(sum/a.length));
		
		
		int max = a[0];
		int smax = a[0]; 
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>max)
			{
				smax= max;
				max = a[i];
			}
			else if(a[i]>smax && a[i]!=max)
			{
				smax = a[i];
			}
			
		}
		
		
		
		
		System.out.println("Max is : "+max);
		System.out.println("sMax is :"+smax);
		
	}
}
