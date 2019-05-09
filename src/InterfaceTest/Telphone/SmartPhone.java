package InterfaceTest.Telphone;

//继承接口
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
	
	//实现接口方法
	@Override
	public void palyGame() {
		// TODO Auto-generated method stub
		System.out.println("Smart Phone Can Play Game");
	}

}
