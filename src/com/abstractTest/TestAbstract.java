
package com.abstractTest;

public class TestAbstract {
	public static void main(String[] args) {
		show(new RoBot());
		show(new Human());
		show(new Cat());
		
		Lesson l = new Lesson();
		l.lessonBegin(new Teacher());
		l.lessonBegin(new Status());
		
	}
	
	public static void show(Action act){
		act.commond(Action.EAT);
		act.commond(Action.SLEEP);
		act.commond(Action.WORK);
	}
}
