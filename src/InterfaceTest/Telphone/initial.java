package InterfaceTest.Telphone;

public class initial {
	public static void main(String[] args) {
		//多态向下类型转换
		Telphone tel1 = new CellPhone();
		tel1.call();
		tel1.sendMessage();
		
		Telphone tel2 =new SmartPhone();
		tel2.call();
		tel2.sendMessage();
		tel2.show();
		
		SmartPhone phone = new SmartPhone();
		phone.palyGame();
		
		
		
		//接口的引用指向实现了接口的对象
		IPlayGame ipe1 = new SmartPhone();
		ipe1.palyGame();
		//接口的引用指向实现了接口的对象
		IPlayGame ipe2 = new Psp();
		ipe2.palyGame();
		
		IPlayGame ipe3 = new IPlayGame(){
			@Override
			/*
			 * 匿名内部类就是没有类的名字
			 * 在使用一个类的时候不关注类的名字，尽在使用的时候定义
			 */
			//通过接口的引用调用playGame方法
			public void palyGame() {
				// TODO Auto-generated method stub
				System.out.println("使用匿名内部类的方式实现接口");
			}
		};
		//直接new接口调用playGame()方法
		new IPlayGame(){

			@Override
			public void palyGame() {
				// TODO Auto-generated method stub
				System.out.println("直接new接口，使用匿名内部类调用接口方法");
			}
		}.palyGame();
	}

}
