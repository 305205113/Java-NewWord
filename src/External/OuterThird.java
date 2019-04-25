package External;

public class OuterThird {
	private int a = 100;
	static int b = 5;
	public static class Inner{
		int b = 3;
		public void test(){
			System.out.println("外部类的b:"+OuterThird.b);
			System.out.println("内部类的b:"+b);
			System.out.println("外部类的非静态变量a:"+new OuterThird().a);
		}
	}
	
	public static void main(String[] args){
		Inner inner = new Inner();
		inner.test();
	}
}
