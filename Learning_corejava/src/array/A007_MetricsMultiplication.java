package array;

public class A007_MetricsMultiplication {
	public static void main(String[] args) {
		
		
		
		
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		
	
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				int sum = 0;
				for(int k=0;k<3;k++)
				{
					sum += a[i][k] * b[k][j];
				}
			}
		}
		
		
		
		
		
	}
}
