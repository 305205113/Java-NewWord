package External;

public class OuterClass {
	private int a = 100;
	int b = 20;
	public class Inner{
		int b = 50;
		public void show(){
			//内部类可以直接访问外部类的方法及成员变量
			System.out.println("The a is External a:"+a);
			//如果内部类与外部类有重名的方法或成员变量，默认访问内部类自己的
			//使用外部类.this.方法\成员变量访问外部类重名方法或变量
			System.out.println("The b is External b:"+OuterClass.this.b);
			System.out.println("The b is Internal b:"+b);
		}
	}
	public static void main(String[] args) {
		OuterClass o = new OuterClass();
		//通过外部类对象创建内部类对象
		Inner i = o.new Inner();
		//访问内部类方法或变量
		i.show();
	}
}
