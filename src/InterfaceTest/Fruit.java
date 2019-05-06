package InterfaceTest;

public interface Fruit {
	public void eat();
}

class Apple implements Fruit{
	public void eat(){
		System.out.println("I like apple c match");
	}
}

class Orange implements Fruit{
	public void eat(){
		System.out.println("Orange is the most delicious fruit in the world ");
	}
}

class Factory1{
	public static Fruit getInstance(String className){
		if("apple".equals(className)){
			return new Apple();
		}
		if("orange".equals(className)){
			return new Orange();
		}
		return null;
	}
}