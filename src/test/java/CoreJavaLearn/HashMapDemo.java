package CoreJavaLearn;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap mymap=new HashMap();
		mymap.put(23, 343);
		mymap.put(24, 344);
		mymap.put(25, 345);
		mymap.put(26, 346);
		mymap.put(27, 347);
		System.out.println(mymap);
		System.out.println("entries in the hashmap\n"+""+mymap.entrySet());
		
		System.out.println("printing entries using conventional for loop");
		System.out.println("Key Set"+mymap.keySet());
		System.out.println("Value Set"+mymap.values());
		for(Object s:mymap.keySet())
			
		{ System.out.println(s+" "+mymap.get(s));			
		}
		
		System.out.println("printing entry using iterator");
		Iterator<Object> it=mymap.entrySet().iterator();
		
		while(it.hasNext())
		{
			Entry entry=(Entry) it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
	}

}
