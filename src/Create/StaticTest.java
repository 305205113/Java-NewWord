package Create;

public class StaticTest {
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		StaticTest.test();
		System.out.println("��main()������"+StaticTest.BANANA+"��ս������"+StaticTest.price);
	}
	public static final String BANANA = "�ڵ϶�";
	public static float price = 0.5f;
	
	static {
		System.out.println("Static ��̬��");
	}
	
	public static void test(){
		System.out.println(StaticTest.BANANA+"��ս������"+StaticTest.price);
	}
	
	
}
