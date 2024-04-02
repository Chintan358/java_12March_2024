package array;

public class A005_MDArray {
	public static void main(String[] args) {
		
		
//		int a[][] = new int[2][3];
//		
//		a[0][0] = 10;
//		a[0][1] = 20;
//		a[0][2] = 30;
//		
//		a[1][0] = 110;
//		a[1][1] = 210;
//		a[1][2] = 310;
//		
		
		int a[][] = {{10,20,30},{1,2,3}};
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		
		
		
	}
}
