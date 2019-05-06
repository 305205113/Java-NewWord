package CollectionTest;

import java.util.Iterator;
import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet hash = new HashSet();
		hash.add("56");
		hash.add("32");
		hash.add("50");
		hash.add("48");
		hash.add("48");
		hash.add("5");
		System.out.println(hash.size());
		
		Iterator iterator = hash.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
