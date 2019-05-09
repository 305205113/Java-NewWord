package com.abstractTest;
//抽象类
public abstract class Action {
	//常量
	public static final int EAT = 1;
	public static final int SLEEP = 2;
	public static final int WORK = 5;
	//抽象类抽象方法
	public abstract void eat();
	
	public abstract void sleep();
	public abstract void work();
	
	public void commond(int flags){
		switch(flags){
			case EAT:
				this.eat();
				break;
			case SLEEP:
				this.sleep();
				break;
			case WORK:
				this.work();
				break;
			case EAT + SLEEP:
				this.eat();
				this.sleep();
				break;
			case SLEEP + WORK:
				this.sleep();
				this.work();
				break;
			default:
				break;
		}
	}
}
