package CollectionTest.ImoocCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	/** 
	 * ����:�ƶ����ͣ������ӷ��ͣ�����ڱ���ʱ���м�飬
	 * ���ͼ��ϲ�����ӹ涨����֮���Ԫ�أ�����ᱨ��
	 * ���ͼ��Ͽ��Դ��뷺�����������͵�Ԫ��
	 */
	
	public List<Course> coursesToSelect;
	public ListTest(){
		//ʵ�������з��͵�list
		this.coursesToSelect = new ArrayList<Course>();
	}
	//��coursesToSelect����ӱ�ѡ�γ�
	public void testAdd(){
		Course cre1 = new Course("0","���ݽṹ");
		//��ӵ�list�У���0λ��Ԫ����cre1
		coursesToSelect.add(0,cre1);
		
		Course cre2 = new Course("1","C����");
		//��ӵ�list�У���1λ��Ԫ����cre2
		coursesToSelect.add(1,cre2);
		
		//��ȡlies�еĵ�0ΪԪ�أ�ǿת��������Course
		Course temp1 = (Course)coursesToSelect.get(1);
		System.out.println(temp1);
		System.out.println("����˿γ̣�"+temp1.id+":"+temp1.name);
		
		//��ȡlist�еĵ�1λ��Ԫ�أ�ǿת��������Course
		Course temp2 = (Course)coursesToSelect.get(0);
		System.out.println(temp2);
		System.out.println("����˿γ̣�"+temp2.id+":"+temp2.name);
		
		//����һ��Courses����
		Course[] course ={new Course("7","Objective-c"),new Course("100","Swift")};
		//��list���в�����ͨ��Arrays.asList������ת����list
		coursesToSelect.addAll(Arrays.asList(course));
		System.out.println("list:"+coursesToSelect);
		//��listת��������
		System.out.println("toArray:"+coursesToSelect.toArray());
		System.out.println("Array[3]:"+coursesToSelect.toArray()[3]);
		
		Course temp3 = (Course)coursesToSelect.toArray()[3];
		System.out.println("����˿γ̣�"+temp3.id+":"+temp3.name);
	}
	
	public static void main(String[] args){
		ListTest lt = new ListTest();
		lt.testAdd();
		lt.getListItem();
		lt.testIterator();
		lt.testModify();
		lt.testForEatch();
		lt.testRemove();
		lt.testRemoveAll();
		
		lt.testChild();
		lt.testBasicType();
	}
	
	//forѭ������list
	public void getListItem(){
		for(int i = 0;i < coursesToSelect.size();i++){
			Course co = (Course)coursesToSelect.get(i);
			System.out.println("��ũ��"+co.id+":"+co.name);
		}
	}
	
	//ͨ������������Iterator���ʼ���Ԫ��
	public void testIterator(){
		//ͨ�����ϵ�Iterator������ȡ������ʵ��
		Iterator<Course> it = coursesToSelect.iterator();
		while (it.hasNext()) {
			Course cr = (Course)it.next();
			System.out.println("Գ�"+cr.id+":"+cr.name);
		}
	}
	
	//ͨ��for each���ʼ���Ԫ��
	public void testForEatch(){
		//�����е�Ԫ��ǿת����
		for(Course obj:coursesToSelect){
			System.out.println("����լ:"+obj.id+":"+obj.name);
		}
	}
	
	//�޸�list�е�Ԫ��
	public void testModify(){
		coursesToSelect.set(0, new Course("872","Java"));
	}
	
	//ɾ��list�е�Ԫ��
	public void testRemove(){
		//ɾ���ƶ�λ���ϵ�Ԫ��
		coursesToSelect.remove(0);
		testForEatch();
	}
	
	public void testRemoveAll(){
		//��list�ƶ�λ���ϵ�Ԫ�ؼ��뵽������
		Course[] ce = {coursesToSelect.get(1),coursesToSelect.get(2)};
		//ͨ��Arrays������ת��Ϊ����
		coursesToSelect.removeAll(Arrays.asList(ce));
		testIterator();
	}
	
	//���ͼ��Ͽ�����ӷ������͵������Ͷ���ʵ��
	public void testChild(){
		ChildCourse ccr = new ChildCourse();
		ccr.id = "783";
		ccr.name = "PHP";
		coursesToSelect.add(ccr);
		testForEatch();
	}
	
	//���Ͳ���ʹ�û�������
	public void testBasicType(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		System.out.println("�������ͱ���ʹ�ð�װ����Ϊ����"+list.get(0));
	}
}
