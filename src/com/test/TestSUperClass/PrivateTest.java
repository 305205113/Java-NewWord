package com.test.TestSUperClass;

public class PrivateTest {
	//������Ϊ˽�з������͵ı���ֻ��ͨ�����еĹ����������ⲿ����
	private String name;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public static void main(String[] args){
		PrivateTest p = new PrivateTest();
		p.setName("��������˿");
		System.out.println("name = "+p.getName());
	}
}
