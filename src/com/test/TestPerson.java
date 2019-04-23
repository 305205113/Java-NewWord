package com.test;

class Person{
	String name;
	int age;
	void setName(String name2){
		name = name2;
	}
	
	
	void setAge(int age2){
		age = age2;
	}
	
	void speak(){
		System.out.println("我叫" + name + ",今年" + age + "岁。");
	}
	//Java允许在创建对象的时候对其成员变量进行初始化，通过构造方法完成
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
}

public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new  Person("凯尔",18);
		p1.speak();
		
	}
}
