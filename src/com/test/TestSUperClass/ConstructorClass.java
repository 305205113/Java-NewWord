package com.test.TestSUperClass;

public class ConstructorClass {
	public static void main(String[] args) {
		System.out.println("------SubClass1 ��̳�------");
		SubClass1 sc1 = new SubClass1();
		SubClass1 Sc2 = new SubClass1(100);
		System.out.println("------SubClass2 ��̳�------");
		
		SubClass2 sc3 = new SubClass2();
		SubClass2 sc4 = new SubClass2(200);
	}
}

//SuperClass ����
class SuperClass{
	private int n;
	SuperClass(){ //������޲���������
		System.out.println("SuperClass()");
	}
	
	SuperClass(int n){ //���ຬ����������
		System.out.println("SuperClass(int n)");
		this.n = n;
	}
}

//SubClass �̳���1
class SubClass1 extends SuperClass{
	private int n;
	SubClass1(){ //�Զ����ø�����޲���������
		System.out.println("SubClass");
	}
	
	public SubClass1(int n){
		super(300); //���ø���ĺ�����������
		System.out.println("SubClass(int n):"+n);
	}
}

//SubClass �̳���2
class SubClass2 extends SuperClass{
	private int n;
	
	SubClass2(){
		super(300); //���ø���ĺ�����������
		System.out.println("SubClass2");
	}
	
	public SubClass2(int n){ //�Զ����ø�����޲���������
		System.out.println("SubClass2(int n)"+n);
		this.n = n;
	}
}