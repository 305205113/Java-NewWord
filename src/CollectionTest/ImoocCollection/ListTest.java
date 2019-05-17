package CollectionTest.ImoocCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	/** 
	 * 泛型:制定类型，如果添加泛型，则会在编译时进行检查，
	 * 泛型集合不能添加规定类型之外的元素，否则会报错
	 * 泛型集合可以存入泛型类型子类型的元素
	 */
	
	public List<Course> coursesToSelect;
	public ListTest(){
		//实例化带有泛型的list
		this.coursesToSelect = new ArrayList<Course>();
	}
	//给coursesToSelect中添加备选课程
	public void testAdd(){
		Course cre1 = new Course("0","数据结构");
		//添加到list中，第0位，元素是cre1
		coursesToSelect.add(0,cre1);
		
		Course cre2 = new Course("1","C语言");
		//添加到list中，第1位，元素是cre2
		coursesToSelect.add(1,cre2);
		
		//获取lies中的地0为元素，强转对象类型Course
		Course temp1 = (Course)coursesToSelect.get(1);
		System.out.println(temp1);
		System.out.println("添加了课程："+temp1.id+":"+temp1.name);
		
		//获取list中的第1位的元素，强转对象类型Course
		Course temp2 = (Course)coursesToSelect.get(0);
		System.out.println(temp2);
		System.out.println("添加了课程："+temp2.id+":"+temp2.name);
		
		//创建一个Courses数组
		Course[] course ={new Course("7","Objective-c"),new Course("100","Swift")};
		//对list进行操作，通过Arrays.asList将数组转换成list
		coursesToSelect.addAll(Arrays.asList(course));
		System.out.println("list:"+coursesToSelect);
		//将list转换成数组
		System.out.println("toArray:"+coursesToSelect.toArray());
		System.out.println("Array[3]:"+coursesToSelect.toArray()[3]);
		
		Course temp3 = (Course)coursesToSelect.toArray()[3];
		System.out.println("添加了课程："+temp3.id+":"+temp3.name);
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
	
	//for循环便利list
	public void getListItem(){
		for(int i = 0;i < coursesToSelect.size();i++){
			Course co = (Course)coursesToSelect.get(i);
			System.out.println("码农："+co.id+":"+co.name);
		}
	}
	
	//通过迭代器便利Iterator访问集合元素
	public void testIterator(){
		//通过集合的Iterator方法获取迭代器实例
		Iterator<Course> it = coursesToSelect.iterator();
		while (it.hasNext()) {
			Course cr = (Course)it.next();
			System.out.println("猿语："+cr.id+":"+cr.name);
		}
	}
	
	//通过for each访问集合元素
	public void testForEatch(){
		//集合中的元素强转类型
		for(Course obj:coursesToSelect){
			System.out.println("技术宅:"+obj.id+":"+obj.name);
		}
	}
	
	//修改list中的元素
	public void testModify(){
		coursesToSelect.set(0, new Course("872","Java"));
	}
	
	//删除list中的元素
	public void testRemove(){
		//删除制定位置上的元素
		coursesToSelect.remove(0);
		testForEatch();
	}
	
	public void testRemoveAll(){
		//将list制定位置上的元素加入到数组中
		Course[] ce = {coursesToSelect.get(1),coursesToSelect.get(2)};
		//通过Arrays将数据转化为集合
		coursesToSelect.removeAll(Arrays.asList(ce));
		testIterator();
	}
	
	//泛型集合可以添加泛型类型的子类型对象实例
	public void testChild(){
		ChildCourse ccr = new ChildCourse();
		ccr.id = "783";
		ccr.name = "PHP";
		coursesToSelect.add(ccr);
		testForEatch();
	}
	
	//泛型不能使用基本类型
	public void testBasicType(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		System.out.println("基本类型必须使用包装类作为泛型"+list.get(0));
	}
}
