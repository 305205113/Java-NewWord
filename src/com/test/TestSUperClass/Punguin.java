package com.test.TestSUperClass;

public class Punguin extends Animal {

	public Punguin(String myName, int myId) {
		super(myName, myId);
	}

	@Override
	public void eat() {
		System.out.println("���ڳԺö���");
	}
	

	public static void main(String[] args){
		Punguin pun = new Punguin("���ﹶ˹",9);
		pun.eat();
		pun.sleep();
		pun.introduction();
		pun.detial = "���鳾������";
		pun.koutouchan();
	}
}
