package com.test.TestSUperClass;
//���༯�ɸ���ӵ�и����private �ķ����ͳ�Ա����
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
