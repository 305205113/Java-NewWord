package Create;
/*
 * 向上转型：父类对象通过子类对象实例化
 * 向下转型：父类对象转换为子类对象，必须强制转换
 */

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
		//向下转型,强制转换
		Cat c = (Cat)a;
		//调用的是Cat的work方法
		c.work();
		
		Dog dog = new Dog();
		//向上来类型转换，自动类型转换
		Animal animal = dog;
		//判断animal对象中是否含有Dog类型的元素
		if(animal instanceof Dog){
			//向下类型转换，强制类型转换
			Dog dog2 =(Dog)animal;
		}else{
			System.out.println("无法进行类型转换Dog");
		}
		//判断animal对象中是否含有Cat类型的元素
		if(animal instanceof Cat){
			//向下类型转换，强制类型转换
			Cat cat = (Cat)animal;
		}else{
			System.out.println("无法进行类型转换Cat");
		}
		
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

//父类
abstract class Animal{
	abstract void say();
}

//子类
class Cat extends Animal{
	public void say(){
		System.out.println("Do you clean anyone?");
	}
	
	public void work(){
		System.out.println("No women, no kids. That's the rules.");
	}
}

//子类
class Dog extends Animal{
	public void say(){
		System.out.println("Is life always this hard."
				+ "or is it just when you’re a kid?");
	}
	
	public void work(){
		System.out.println("always.");
	}
}