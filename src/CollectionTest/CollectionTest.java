package CollectionTest;

//Ctrl+Shift+O 快捷引入，需要注意当有不同包中有重复类时引入易出错
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
	public static void main(String[] args) {
		//创建集合
		Collection collection = new ArrayList();
		
		//向集合中添加元素
		collection.add("Apple");
		collection.add("Banana");
		collection.add("Pear");
		collection.add("Orange");
		//获取集合中元素个数
		System.out.println(collection.size());
		
		//创建新的集合
		ArrayList array = new ArrayList();
		array.add("Cat");
		array.add("Dog");
		//判断集合是否为空
		if(!array.isEmpty()){
			//向数组中添加数组
			collection.addAll(array);
		}
		System.out.println(collection.size());
		//创建迭代器
		Iterator iterator = collection.iterator();
		System.out.println("---"+iterator+"---");
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		//数组中是否包含Cat
		if(collection.contains("Cat")){
			System.out.println("The array contain cat");
		}
		
		//从数组中移除数组
		collection.removeAll(array);
		//返回迭代器
		iterator = collection.iterator();
		//遍历迭代器中的元素
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		//将集合中的元素存放到字符串数组中
		Object[] str = collection.toArray();
		System.out.println("********"+str.length+"********");
		String s = "";
		for(int i = 0 ;i < str.length ;i++){
			//将对象强制转换成字符串类型
			s = (String)str[i];
			System.out.println(s+" ");
		}
	}
}
