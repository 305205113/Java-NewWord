package CollectionTest.ImoocCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
	//创建一个泛型为Course的list
	public static List<Course> coursesToSelect;
	
	//构造方法
	public SetTest(){
		//创建泛型list对象
		coursesToSelect = new ArrayList<Course>();
	}
	
	//给coursesToSelect中添加备选课程
		public void testAdd(){
			Course cre1 = new Course("0","数据结构");
			//添加到list中，第0位，元素是cre1
			coursesToSelect.add(0,cre1);
			
			Course cre2 = new Course("1","C语言");
			//添加到list中，第1位，元素是cre2
			coursesToSelect.add(1,cre2);
			
			
			Course[] course ={new Course("7","Objective-c"),new Course("100","Swift")};
			//对list进行操作，通过Arrays.asList将数组转换成list
			coursesToSelect.addAll(Arrays.asList(course));
		}
		
	//通过for each访问集合元素
	public void testForEatch(){
	//集合中的元素强转类型
		for(Course obj:coursesToSelect){
			System.out.println("技术宅:"+obj.id+":"+obj.name);
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetTest st = new SetTest();
		st.testAdd();
		st.testForEatch();
		//调用含参构造方法创建Student对象
		Student stu = new Student("1","奈萨利");
		System.out.println("欢迎学生："+stu.name+"选课！");
		
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		
		for (int i = 0 ;i< 3;i++){
			System.out.println("请输入课程ID");
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
			System.out.println("选择了课程："+cr.id+":"+cr.name);
		}
	}

}
