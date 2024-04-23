package collection;

import java.util.ArrayList;

public class C001_ArralistDemo {
	public static void main(String[] args) {
		
		
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("slenium");
		al.add("testing");
		al.add("node");
		al.add("php");
		
		//al.add(2,"SQL");
		//al.set(1, "python");
		//al.remove(2);
		
		//System.out.println(al.get(3));
		
		for(String s : al)
		{
			System.out.println(s);
		}
		
		
		System.out.println("*********************");
		
		
		ArrayList k = new ArrayList();
		k.add(10);
		k.add(10.23);
		k.add('A');
		k.add("dhara");
		
		
		
		for(Object o : k)
		{
			System.out.println(o);
		}
		
		
	}
}
