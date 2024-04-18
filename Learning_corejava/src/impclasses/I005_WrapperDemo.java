package impclasses;

public class I005_WrapperDemo {
	public static void main(String[] args) {
		
		int i = 10;
	
		//boxing
		Integer i1 = new Integer(i);
		//autoboxing
		Integer i2 = i;
		
		
		
		Integer k = 5656;
		//boxing
		int k1 = k.intValue();
		//autoboxing
		int k2 = k;
		
		
		int j = 4655456;
		Integer j1  = j;
		int l =  j1.toString().length();
		System.out.println(l);
		
	}
}
