package InterfaceTest;

public interface USB {
	public void start();
	public void stop();
}

class Mouse implements USB{
	public void start(){
		System.out.println("The mouse is working");
	}
	
	public void stop(){
		System.out.println("The mouse is stop work");
	}
}

class KeyBoard implements USB{
	public void start(){
		System.out.println("The keyBoard is working");
	}
	public void stop(){
		System.out.println("The keyboard is stop working");
	}
}

class MainBoard {
	public void plugin(USB usb){
		usb.start();
		usb.stop();
	}
}