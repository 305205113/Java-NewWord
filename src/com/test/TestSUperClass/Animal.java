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
		System.out.println(name + "正在睡觉");
	}
	
	public void introduction(){
		System.out.println("大家好！我是"+id+"号"+name+"。");
	}
	
	public void koutouchan(){
		System.out.println(name+"的口头禅是"+detial);
	}
	
}
