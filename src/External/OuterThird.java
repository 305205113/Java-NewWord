package External;

public class OuterThird {
	private int a = 100;
	static int b = 5;
	public static class Inner{
		int b = 3;
		public void test(){
			System.out.println("�ⲿ���b:"+OuterThird.b);
			System.out.println("�ڲ����b:"+b);
			System.out.println("�ⲿ��ķǾ�̬����a:"+new OuterThird().a);
		}
	}
	
	public static void main(String[] args){
		Inner inner = new Inner();
		inner.test();
	}
}
