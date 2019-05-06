package CollectionTest;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("Cat");
		list.add("Dog");
		list.add("Pig");
		list.add("Sheep");
		list.add("Mouse");
		list.add("Duck");
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.removeFirst());
		System.out.println(list.removeLast());
		System.out.println("\n");
		iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
