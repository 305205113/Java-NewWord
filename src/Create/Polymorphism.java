package Create;

public class Polymorphism {
	public static void main(String[] args) {
		//以Cat对象调用show方法
		show(new Cat());
		//以Dog对象调用show方法
		show(new Dog());
		
		//向上转型
		Animal a = new Cat();
		//调用的是Cat的say方法
		a.say();
		//向下转型
		Cat c = (Cat)a;
		//调用的是Cat的work方法
		c.work();
	}
	
	public static void show(Animal a){
		a.say();
		//判断类型
		if(a instanceof Cat){
			//Cat做的事情
			Cat c = (Cat)a;
			c.work();
		}else if(a instanceof Dog){
			//Dog做的事情
			Dog d = (Dog)a;
			d.work();
		}
	}
}

abstract class Animal{
	abstract void say();
}

class Cat extends Animal{
	public void say(){
		System.out.println("Do you clean anyone?");
	}
	
	public void work(){
		System.out.println("No women, no kids. That's the rules.");
	}
}

class Dog extends Animal{
	public void say(){
		System.out.println("Is life always this hard."
				+ "or is it just when you’re a kid?");
	}
	
	public void work(){
		System.out.println("always.");
	}
}