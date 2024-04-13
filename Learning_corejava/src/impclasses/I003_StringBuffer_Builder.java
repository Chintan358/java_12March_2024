package impclasses;

public class I003_StringBuffer_Builder {
	public static void main(String[] args) {
		
		//sync
		double startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Hello");
		for(int i=0;i<=1000000;i++)
		{
			sb.append("Java");
		}
		double endTime = System.currentTimeMillis();
		
		
		//async
		double startTime1 = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("Hello");
		for(int i=0;i<=1000000;i++)
		{
			sb1.append("Java");
		}
		double endTime1 = System.currentTimeMillis();
		
		
		System.out.println("time taken by buffer : "+(endTime-startTime));
		System.out.println("time taken by Builder : "+(endTime1-startTime1));
		
		
	}
}
