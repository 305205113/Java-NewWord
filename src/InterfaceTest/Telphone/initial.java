package InterfaceTest.Telphone;

public class initial {
	public static void main(String[] args) {
		//��̬��������ת��
		Telphone tel1 = new CellPhone();
		tel1.call();
		tel1.sendMessage();
		
		Telphone tel2 =new SmartPhone();
		tel2.call();
		tel2.sendMessage();
		tel2.show();
		
		SmartPhone phone = new SmartPhone();
		phone.palyGame();
		
		
		
		//�ӿڵ�����ָ��ʵ���˽ӿڵĶ���
		IPlayGame ipe1 = new SmartPhone();
		ipe1.palyGame();
		//�ӿڵ�����ָ��ʵ���˽ӿڵĶ���
		IPlayGame ipe2 = new Psp();
		ipe2.palyGame();
		
		IPlayGame ipe3 = new IPlayGame(){
			@Override
			/*
			 * �����ڲ������û���������
			 * ��ʹ��һ�����ʱ�򲻹�ע������֣�����ʹ�õ�ʱ����
			 */
			//ͨ���ӿڵ����õ���playGame����
			public void palyGame() {
				// TODO Auto-generated method stub
				System.out.println("ʹ�������ڲ���ķ�ʽʵ�ֽӿ�");
			}
		};
		//ֱ��new�ӿڵ���playGame()����
		new IPlayGame(){

			@Override
			public void palyGame() {
				// TODO Auto-generated method stub
				System.out.println("ֱ��new�ӿڣ�ʹ�������ڲ�����ýӿڷ���");
			}
		}.palyGame();
	}

}
