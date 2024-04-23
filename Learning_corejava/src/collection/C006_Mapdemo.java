package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class C006_Mapdemo {
	public static void main(String[] args) {
		
		
		
		
		HashMap<String, String> map = new  HashMap<String, String>();
		map.put("India", "IN");
		map.put("USA", "US");
		map.put("Canada", "CAN");
		
		//System.out.println(map);
		
		Set s = map.entrySet();
		
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
