package collection;

import java.util.ArrayList;

public class C002_ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<Integer> k = new ArrayList<Integer>();
		k.add(100);
		k.add(200);
		k.add(300);
		
		
		ArrayList<Integer> al = new ArrayList<Integer>(k);
		al.add(10);
		al.add(12);
		al.add(50);
		al.add(60);
		al.add(60);
		al.add(null);
		al.addAll(k);
		
		for(Integer i : al)
		{
			System.out.println(i);
		}
		
	}
}
