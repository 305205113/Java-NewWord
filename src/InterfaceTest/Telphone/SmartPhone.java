package InterfaceTest.Telphone;

//�̳нӿ�
public class SmartPhone extends Telphone implements IPlayGame{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Smart Phone call");
	}

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("Smart Phone send message");
	}
	
	//ʵ�ֽӿڷ���
	@Override
	public void palyGame() {
		// TODO Auto-generated method stub
		System.out.println("Smart Phone Can Play Game");
	}

}
