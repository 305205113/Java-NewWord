package External;

public class OuterThird {
	private int a = 100;
	static int b = 5;
	//静态内部类
	public static class Inner{
		int b = 3;
		public void test(){
			//静态内部类可以直接访问外部类的静态成员
			System.out.println("外部类的b:"+OuterThird.b);
			//内部类与外部类有重名变量或方法时采用就近原则
			System.out.println("内部类的b:"+b);
			/*
			 * 静态内部类不能直接访问外部类的非静态成员
			 * 可以通过方法new 外部类().成员来访问
			 */
			System.out.println("外部类的非静态变量a:"+new OuterThird().a);
		}
	}
	
	public static void main(String[] args){
		/*
		 * 创建静态内部类时不需要外部类对象
		 * 直接创建：内部类 对象名= new 内部类()；
		 */
		Inner inner = new Inner();
		inner.test();
	}
}
