package com.abstractTest;

public abstract class Persion {
	public abstract void call();
}

class Teacher extends Persion{
	public void call(){
		System.out.println("I will gave your my parwer,but no today");
	}
}

class Status extends Persion{
	public void call(){
		System.out.println("The most deadly is stupid arrogance,Trembling mortal");
	}
}

class Lesson{
	public void lessonBegin(Persion p){
		p.call();
	}
}