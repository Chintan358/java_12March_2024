package operator;

public class O005_turnary {
	public static void main(String[] args) {
		
		
		int a = 100;
		int b = 200;
		int c = 300;
		
		//condtion ? true : false
		
		String r =  (a>b) ? (a>c)?"a is greater" : "c is greater":(b>c)?"b is greater":"c is greater";
		System.out.println(r);
		
		
		
		
	}
}
