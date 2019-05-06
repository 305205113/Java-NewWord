package CollectionTest;

//Ctrl+Shift+O ������룬��Ҫע�⵱�в�ͬ�������ظ���ʱ�����׳���
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
	public static void main(String[] args) {
		//��������
		Collection collection = new ArrayList();
		
		//�򼯺������Ԫ��
		collection.add("Apple");
		collection.add("Banana");
		collection.add("Pear");
		collection.add("Orange");
		//��ȡ������Ԫ�ظ���
		System.out.println(collection.size());
		
		//�����µļ���
		ArrayList array = new ArrayList();
		array.add("Cat");
		array.add("Dog");
		//�жϼ����Ƿ�Ϊ��
		if(!array.isEmpty()){
			//���������������
			collection.addAll(array);
		}
		System.out.println(collection.size());
		//����������
		Iterator iterator = collection.iterator();
		System.out.println("---"+iterator+"---");
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		//�������Ƿ����Cat
		if(collection.contains("Cat")){
			System.out.println("The array contain cat");
		}
		
		//���������Ƴ�����
		collection.removeAll(array);
		//���ص�����
		iterator = collection.iterator();
		//�����������е�Ԫ��
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		//�������е�Ԫ�ش�ŵ��ַ���������
		Object[] str = collection.toArray();
		System.out.println("********"+str.length+"********");
		String s = "";
		for(int i = 0 ;i < str.length ;i++){
			//������ǿ��ת�����ַ�������
			s = (String)str[i];
			System.out.println(s+" ");
		}
	}
}
