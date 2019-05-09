package com.abstractTest;
//������
public abstract class Action {
	//����
	public static final int EAT = 1;
	public static final int SLEEP = 2;
	public static final int WORK = 5;
	//��������󷽷�
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
