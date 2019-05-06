package CollectionTest;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args){
		TreeSet tree = new TreeSet();
		tree.add("a");
		tree.add("32");
		tree.add("68");
		tree.add("d");
		tree.add("20");
		tree.add("80");
		tree.add("75");
		System.out.println(tree.size());
		
		Iterator iterator = tree.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		SortedSet s1 = tree.subSet("20", "68");
		iterator = s1.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		SortedSet s2 = tree.headSet("45");
		iterator = s2.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		SortedSet s3 = tree.tailSet("45");
		iterator = s3.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.println(tree.first());
		System.out.println(tree.last());
		System.out.println("获取并移出集合中的第一个元素"+tree.pollFirst());
		System.out.println("获取并移出集合中的最后一个元素"+tree.pollLast());
		
		iterator = tree.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
