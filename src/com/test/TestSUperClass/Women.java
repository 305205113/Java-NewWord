package com.test.TestSUperClass;

import Create.Person;

public class Women extends Person {
	public static void main(String[] args) {
		Women w = new Women();
		w.name = "吉安娜说";
		System.out.println(w.name);
		w.sing();//调用继承的父类方法
	}
}
