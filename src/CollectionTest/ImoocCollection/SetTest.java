package CollectionTest.ImoocCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
	//����һ������ΪCourse��list
	public static List<Course> coursesToSelect;
	
	//���췽��
	public SetTest(){
		//��������list����
		coursesToSelect = new ArrayList<Course>();
	}
	
	//��coursesToSelect����ӱ�ѡ�γ�
		public void testAdd(){
			Course cre1 = new Course("0","���ݽṹ");
			//��ӵ�list�У���0λ��Ԫ����cre1
			coursesToSelect.add(0,cre1);
			
			Course cre2 = new Course("1","C����");
			//��ӵ�list�У���1λ��Ԫ����cre2
			coursesToSelect.add(1,cre2);
			
			
			Course[] course ={new Course("7","Objective-c"),new Course("100","Swift")};
			//��list���в�����ͨ��Arrays.asList������ת����list
			coursesToSelect.addAll(Arrays.asList(course));
		}
		
	//ͨ��for each���ʼ���Ԫ��
	public void testForEatch(){
	//�����е�Ԫ��ǿת����
		for(Course obj:coursesToSelect){
			System.out.println("����լ:"+obj.id+":"+obj.name);
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetTest st = new SetTest();
		st.testAdd();
		st.testForEatch();
		//���ú��ι��췽������Student����
		Student stu = new Student("1","������");
		System.out.println("��ӭѧ����"+stu.name+"ѡ�Σ�");
		
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		
		for (int i = 0 ;i< 3;i++){
			System.out.println("������γ�ID");
			String courseID = console.next();
			for(Course ce:coursesToSelect){
				if(ce.id.equals(courseID)){
					stu.courses.add(ce);
				}
			}
		}
		st.testForeachForSet(stu);
	}
	
	public void testForeachForSet(Student stu){
		for(Course cr:stu.courses){
			System.out.println("ѡ���˿γ̣�"+cr.id+":"+cr.name);
		}
	}

}
