package com.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1���ڴ浥Ԫ�ĳ�����8bits��Ҳ����һ���ֽڣ�һ���ֽ���8λ��
		System.out.println("Hello world");
		//byte ���͵�����ռ��8λ�ڴ�ռ䣬����ȡֵ��Χ��-128~127
		byte byte_min = Byte.MIN_VALUE;
		byte byte_max = Byte.MAX_VALUE;
		System.out.println("byte ���͵���Сֵ�ǣ�"+byte_min);
		System.out.println("byte ���͵����ֵ�ǣ�"+byte_max);
		
		//short ���͵�����ռ��16λ�ڴ�ռ䣬����ȡֵ��Χ��-32768~32767
		short short_min = Short.MIN_VALUE;
		short short_max = Short.MAX_VALUE;
		System.out.println("short ���͵���Сֵ�ǣ�"+short_min);
		System.out.println("short ���͵����ֵ�ǣ�"+short_max);
		
		//int ��������ռ��32λ�ڴ�ռ䣬����ȡֵ��Χ��-2147483648~2147483647
		int int_min = Integer.MIN_VALUE;
		int int_max = Integer.MAX_VALUE;
		System.out.println("int ���͵���Сֵ�ǣ�"+int_min);
		System.out.println("int ���͵����ֵ�ǣ�"+int_max);
		
		//long ��������ռ��64λ�ڴ�ռ䣬����ȡֵ��Χ��-9223372036854775808~9223372036854775807
		long long_min = Long.MIN_VALUE;
		long long_max = Long.MAX_VALUE;
		System.out.println("long ���͵���Сֵ�ǣ�"+long_min);
		System.out.println("long ���͵����ֵ�ǣ�"+long_max);
		
		//float ��������ռ��4byteλ�ڴ�ռ䣬����ȡֵ��Χ��1.4E-45~3.4028235E38
		float float_min = Float.MIN_VALUE;
		float float_max = Float.MAX_VALUE;
		System.out.println("float ���͵���Сֵ�ǣ�"+float_min);
		System.out.println("float ���͵����ֵ�ǣ�"+float_max);
		
		//double ��������ռ��8byteλ�ڴ�ռ䣬����ȡֵ��Χ��4.9E-324~1.7976931348623157E308
		double double_min = Double.MIN_VALUE;
		double double_max = Double.MAX_VALUE;
		System.out.println("double ���͵���Сֵ�ǣ�"+double_min);
		System.out.println("double ���͵����ֵ�ǣ�"+double_max);
		
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
		//ֵ����
		int as = 3;
		int ad = 5; 
		change(as,ad);
		System.out.println("as="+as);
		System.out.println("ad="+ad);
		
		//���ô���
		A a = new A();
		add(a);
		System.out.println(a.i);
	}
	//ֵ�����ڷ����иı�ֵ����Ӱ�����ʱ�������ֵ
	public static void change(int i,int j){
		int temp = i;
		i = j;
		j = temp;
		System.out.println("i ="+i+"��j = "+j);
	}
	
	//���ô��ݴ��ݲ����ĵ�ַ�Բ�����ַ���ı䣬��Ӱ��ʵ��ֵ
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
		//����ĸaת��Ϊ��ĸA����ASCLL����ֵ���32
		System.out.println((char)(y-32));
	}
	
	public void printBoolean(){
		boolean t = true;
		System.out.println("t="+t);
	}
	
	public void printString(){
		String s1 = "�Ұ�ѧ";
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
		System.out.println("Բ���ʦ�Լ����"+PI);
	}
	
	public void printVariable(){
		int x = 10;
		x = 20;
		System.out.println("x="+x);
	}
	//��̬������ֱ��ʹ�� Class.����
	public static String name = "�������";
	//����ʵ����������Ҫʵ�����������ܷ���
	public int i;
	
	public void test2(){
		//������������ֻ���ڷ�����ʹ��
		int j = 3;
		if(j ==3 ){
			//�鼶����
			int k = 5;
			System.out.println("k="+k);
		}
		System.out.println("name="+name+",i="+i+",j="+j);
	}		
}

class SendParameter{
	
	
}

 
