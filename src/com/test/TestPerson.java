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
		System.out.println("�ҽ�" + name + ",����" + age + "�ꡣ");
	}
	//Java�����ڴ��������ʱ������Ա�������г�ʼ����ͨ�����췽�����
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
}

public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new  Person("����",18);
		p1.speak();
		
	}
}
