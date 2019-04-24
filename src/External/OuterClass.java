package External;

public class OuterClass {
	private int a = 100;
	int b = 20;
	public class Inner{
		int b = 50;
		public void show(){
			System.out.println("The a is External a:"+a);
			System.out.println("The b is External b:"+OuterClass.this.b);
			System.out.println("The b is Internal b:"+b);
		}
	}
	public static void main(String[] args) {
		OuterClass o = new OuterClass();
		Inner i = o.new Inner();
		i.show();
	}
}
