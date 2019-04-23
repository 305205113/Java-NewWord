package com.test.TestSUperClass;

public class Punguin extends Animal {

	public Punguin(String myName, int myId) {
		super(myName, myId);
	}

	@Override
	public void eat() {
		System.out.println("正在吃好东西");
	}
	

	public static void main(String[] args){
		Punguin pun = new Punguin("玛里苟斯",9);
		pun.eat();
		pun.sleep();
		pun.introduction();
		pun.detial = "尘归尘土归土";
		pun.koutouchan();
	}
}
