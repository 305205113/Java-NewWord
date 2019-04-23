package Create;

public class StaticTest {
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		StaticTest.test();
		System.out.println("在main()方法中"+StaticTest.BANANA+"的战斗力是"+StaticTest.price);
	}
	public static final String BANANA = "乌迪尔";
	public static float price = 0.5f;
	
	static {
		System.out.println("Static 静态块");
	}
	
	public static void test(){
		System.out.println(StaticTest.BANANA+"的战斗力是"+StaticTest.price);
	}
	
	
}
