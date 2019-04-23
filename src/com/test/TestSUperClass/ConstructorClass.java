package com.test.TestSUperClass;

public class ConstructorClass {
	public static void main(String[] args) {
		System.out.println("------SubClass1 类继承------");
		SubClass1 sc1 = new SubClass1();
		SubClass1 Sc2 = new SubClass1(100);
		System.out.println("------SubClass2 类继承------");
		
		SubClass2 sc3 = new SubClass2();
		SubClass2 sc4 = new SubClass2(200);
	}
}

//SuperClass 父类
class SuperClass{
	private int n;
	SuperClass(){ //父类的无参数构造器
		System.out.println("SuperClass()");
	}
	
	SuperClass(int n){ //父类含参数构造器
		System.out.println("SuperClass(int n)");
		this.n = n;
	}
}

//SubClass 继承类1
class SubClass1 extends SuperClass{
	private int n;
	SubClass1(){ //自动调用父类的无参数构造器
		System.out.println("SubClass");
	}
	
	public SubClass1(int n){
		super(300); //调用父类的含参数构造器
		System.out.println("SubClass(int n):"+n);
	}
}

//SubClass 继承类2
class SubClass2 extends SuperClass{
	private int n;
	
	SubClass2(){
		super(300); //调用父类的含参数构造器
		System.out.println("SubClass2");
	}
	
	public SubClass2(int n){ //自动调用父类的无参数构造器
		System.out.println("SubClass2(int n)"+n);
		this.n = n;
	}
}