package Imooc;

public class initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�̳�
		Chinese c = new Chinese();
		American a = new American();
		c.say();
		a.say();
		
		//��̬
		Person p1 = new Chinese();
		Person p2 = new American();
		p1.say();
		p2.say();
		
		//������
		APerson a1 = new Chinesea();
		APerson a2 = new Americana();
		a1.say();
		a2.say();
	}

}
