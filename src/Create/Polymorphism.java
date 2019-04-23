package Create;

public class Polymorphism {
	public static void main(String[] args) {
		//��Cat�������show����
		show(new Cat());
		//��Dog�������show����
		show(new Dog());
		
		//����ת��
		Animal a = new Cat();
		//���õ���Cat��say����
		a.say();
		//����ת��
		Cat c = (Cat)a;
		//���õ���Cat��work����
		c.work();
	}
	
	public static void show(Animal a){
		a.say();
		//�ж�����
		if(a instanceof Cat){
			//Cat��������
			Cat c = (Cat)a;
			c.work();
		}else if(a instanceof Dog){
			//Dog��������
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
				+ "or is it just when you��re a kid?");
	}
	
	public void work(){
		System.out.println("always.");
	}
}