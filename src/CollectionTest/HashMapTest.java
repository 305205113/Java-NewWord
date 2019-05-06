package CollectionTest;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("101", "zui");
		map.put("102", "jin");
		map.put("103", "hao");
		map.put("104", "can");
		map.put("105", "bei");
		map.put("106", "zhuang");
		System.out.println(map.get("102"));
		Set s = map.keySet();
		Iterator iterator = s.iterator();
		String key = "";
		while(iterator.hasNext()){
			key = (String)iterator.next();
			System.out.println(key+":"+map.get(key));
			
		}
	}
}
