package External;

public class OuterClass {
	private int a = 100;
	int b = 20;
	public class Inner{
		int b = 50;
		public void show(){
			//�ڲ������ֱ�ӷ����ⲿ��ķ�������Ա����
			System.out.println("The a is External a:"+a);
			//����ڲ������ⲿ���������ķ������Ա������Ĭ�Ϸ����ڲ����Լ���
			//ʹ���ⲿ��.this.����\��Ա���������ⲿ���������������
			System.out.println("The b is External b:"+OuterClass.this.b);
			System.out.println("The b is Internal b:"+b);
		}
	}
	public static void main(String[] args) {
		OuterClass o = new OuterClass();
		//ͨ���ⲿ����󴴽��ڲ������
		Inner i = o.new Inner();
		//�����ڲ��෽�������
		i.show();
	}
}
