package com.test.TestSUperClass;

public abstract class Animal {
	private String name;
	private int id;
	String detial;
	
	public Animal(String myName,int myId){
		name = myName;
		id = myId;
	}
	
	public abstract void eat();
	
	public void sleep(){
		System.out.println(name + "����˯��");
	}
	
	public void introduction(){
		System.out.println("��Һã�����"+id+"��"+name+"��");
	}
	
	public void koutouchan(){
		System.out.println(name+"�Ŀ�ͷ����"+detial);
	}
	
}
