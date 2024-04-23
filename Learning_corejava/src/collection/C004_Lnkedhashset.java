package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class C004_Lnkedhashset {
	public static void main(String[] args) {
		
		
		
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("php");
		set.add("android");
		set.add("java");
		set.add("selenium");
		set.add("java");
		
//		for(String s : set)
//		{
//			System.out.println(s);
//		}
		
		//Iterator<String> itr = set.iterator();
		Iterator<String> itr = set.descendingIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}
}
