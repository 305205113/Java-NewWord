package InterfaceTest;

public class Factory {
	public static void main(String[] args) {
		Fruit f = Factory1.getInstance(args[0]);
		f.eat();
	}
}
