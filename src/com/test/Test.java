package com.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1个内存单元的长度是8bits，也就是一个字节，一个字节是8位。
		System.out.println("Hello world");
		//byte 类型的数据占据8位内存空间，数据取值范围是-128~127
		byte byte_min = Byte.MIN_VALUE;
		byte byte_max = Byte.MAX_VALUE;
		System.out.println("byte 类型的最小值是："+byte_min);
		System.out.println("byte 类型的最大值是："+byte_max);
		
		//short 类型的数据占据16位内存空间，数据取值范围是-32768~32767
		short short_min = Short.MIN_VALUE;
		short short_max = Short.MAX_VALUE;
		System.out.println("short 类型的最小值是："+short_min);
		System.out.println("short 类型的最大值是："+short_max);
		
		//int 类型数据占据32位内存空间，数据取值范围是-2147483648~2147483647
		int int_min = Integer.MIN_VALUE;
		int int_max = Integer.MAX_VALUE;
		System.out.println("int 类型的最小值是："+int_min);
		System.out.println("int 类型的最大值是："+int_max);
		
		//long 类型数据占据64位内存空间，数据取值范围是-9223372036854775808~9223372036854775807
		long long_min = Long.MIN_VALUE;
		long long_max = Long.MAX_VALUE;
		System.out.println("long 类型的最小值是："+long_min);
		System.out.println("long 类型的最大值是："+long_max);
		
		//float 类型数据占据4byte位内存空间，数据取值范围是1.4E-45~3.4028235E38
		float float_min = Float.MIN_VALUE;
		float float_max = Float.MAX_VALUE;
		System.out.println("float 类型的最小值是："+float_min);
		System.out.println("float 类型的最大值是："+float_max);
		
		//double 类型数据占据8byte位内存空间，数据取值范围是4.9E-324~1.7976931348623157E308
		double double_min = Double.MIN_VALUE;
		double double_max = Double.MAX_VALUE;
		System.out.println("double 类型的最小值是："+double_min);
		System.out.println("double 类型的最大值是："+double_max);
		
		Test1 print = new Test1();
		print.printChar('a');
		print.printBoolean();
		print.printString();
		print.printChangedate();
		print.printStrongChange();
		print.printFinaldata();
		print.printVariable();
		System.out.println(Test1.name);
		print.test2();
		//值传递
		int as = 3;
		int ad = 5; 
		change(as,ad);
		System.out.println("as="+as);
		System.out.println("ad="+ad);
		
		//引用传递
		A a = new A();
		add(a);
		System.out.println(a.i);
	}
	//值传递在方法中改变值并不影响调用时候的真正值
	public static void change(int i,int j){
		int temp = i;
		i = j;
		j = temp;
		System.out.println("i ="+i+"，j = "+j);
	}
	
	//引用传递传递参数的地址对参数地址做改变，会影响实际值
	public static void add(A a){
		a = new A();
		a.i++;
		}
}

class A{
	int i = 0;
}

class Test1{
	public void printChar(char a){
		char x = a;
		int y = x;
		System.out.println(y);
		//将字母a转换为字母A，在ASCLL码中值相差32
		System.out.println((char)(y-32));
	}
	
	public void printBoolean(){
		boolean t = true;
		System.out.println("t="+t);
	}
	
	public void printString(){
		String s1 = "我爱学";
		String s2 = "Java";
		System.out.println(s1+s2);
	}
	
	public void printChangedate(){
		int x = 10;
		float y = 20.3f;
		System.out.println(x+y);
		System.out.println((int)(x+y));
	}
	
	public void printStrongChange(){
		double d = 3.10;
		int n = (int)d;
		System.out.println(n);
		
		int b = 123;
		byte x = (byte)b;
		
		int m = 1234;
		byte x1 = (byte)m;
		
		System.out.println(x+"****"+x1);
		
	}
	
	public void printFinaldata(){
		final double PI = 3.14159265;
		System.out.println("圆周率π约等于"+PI);
	}
	
	public void printVariable(){
		int x = 10;
		x = 20;
		System.out.println("x="+x);
	}
	//静态变量，直接使用 Class.调用
	public static String name = "世界你好";
	//对象级实例变量，需要实例化对象后才能访问
	public int i;
	
	public void test2(){
		//方法及变量，只能在方法内使用
		int j = 3;
		if(j ==3 ){
			//块级变量
			int k = 5;
			System.out.println("k="+k);
		}
		System.out.println("name="+name+",i="+i+",j="+j);
	}		
}

class SendParameter{
	
	
}

 
