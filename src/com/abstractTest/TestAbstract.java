package com.abstractTest;

public class TestAbstract {
	public static void main(String[] args) {
		show(new RoBot());
		show(new Human());
		show(new Cat());
	}
	
	public static void show(Action act){
		act.commond(Action.EAT);
		act.commond(Action.SLEEP);
		act.commond(Action.WORK);
	}
}
