package CollectionTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		//创建初始容量为10的空列表
		ArrayList list = new ArrayList();
		//添加元素到list中
		list.add("Cat");
		list.add("Dog");
		list.add("Pig");
		list.add("Sheep");
		list.add("Pig");
		System.out.println(list);
		//返回迭代器
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println("\n");
		//替换下标为1的元素为mouse
		list.set(1, "Mouse");
		//返回迭代器
		iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		//获取集合中索引为2的元素
		System.out.println(list.get(2));
		//获取集合中第一次出现Pig的索引
		System.out.println(list.indexOf("Pig"));
		//获取集合中最后一次出现Dog的索引，集合中没有Dog返回-1
		System.out.println(list.lastIndexOf("Dog"));
		//返回集中从开始索引1到结束索引3之间的一个新的集合
		List l = list.subList(1, 3);
		//替换迭代器对象
		iterator = l.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		
	}
}
