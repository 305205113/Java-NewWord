package CollectionTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		//������ʼ����Ϊ10�Ŀ��б�
		ArrayList list = new ArrayList();
		//���Ԫ�ص�list��
		list.add("Cat");
		list.add("Dog");
		list.add("Pig");
		list.add("Sheep");
		list.add("Pig");
		System.out.println(list);
		//���ص�����
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println("\n");
		//�滻�±�Ϊ1��Ԫ��Ϊmouse
		list.set(1, "Mouse");
		//���ص�����
		iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		//��ȡ����������Ϊ2��Ԫ��
		System.out.println(list.get(2));
		//��ȡ�����е�һ�γ���Pig������
		System.out.println(list.indexOf("Pig"));
		//��ȡ���������һ�γ���Dog��������������û��Dog����-1
		System.out.println(list.lastIndexOf("Dog"));
		//���ؼ��дӿ�ʼ����1����������3֮���һ���µļ���
		List l = list.subList(1, 3);
		//�滻����������
		iterator = l.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		
	}
}
