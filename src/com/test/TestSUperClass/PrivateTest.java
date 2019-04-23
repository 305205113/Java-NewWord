package com.test.TestSUperClass;

public class PrivateTest {
	//被声明为私有访问类型的变量只能通过类中的公共方法被外部访问
	private String name;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public static void main(String[] args){
		PrivateTest p = new PrivateTest();
		p.setName("西尔瓦娜丝");
		System.out.println("name = "+p.getName());
	}
}
