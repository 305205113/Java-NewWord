package External;

public class OuterThird {
	private int a = 100;
	static int b = 5;
	//��̬�ڲ���
	public static class Inner{
		int b = 3;
		public void test(){
			//��̬�ڲ������ֱ�ӷ����ⲿ��ľ�̬��Ա
			System.out.println("�ⲿ���b:"+OuterThird.b);
			//�ڲ������ⲿ�������������򷽷�ʱ���þͽ�ԭ��
			System.out.println("�ڲ����b:"+b);
			/*
			 * ��̬�ڲ��಻��ֱ�ӷ����ⲿ��ķǾ�̬��Ա
			 * ����ͨ������new �ⲿ��().��Ա������
			 */
			System.out.println("�ⲿ��ķǾ�̬����a:"+new OuterThird().a);
		}
	}
	
	public static void main(String[] args){
		/*
		 * ������̬�ڲ���ʱ����Ҫ�ⲿ�����
		 * ֱ�Ӵ������ڲ��� ������= new �ڲ���()��
		 */
		Inner inner = new Inner();
		inner.test();
	}
}
