package InterfaceTest;

public class ShapeTest {
	public static void main(String[] args) {
		Shape s1 = new Circle(10.0);
		System.out.println("Բ�������"+s1.area());
		System.out.println("Բ���ܳ���"+s1.perimeter());
		
		Shape s2 = new Rectangle(5.0,10.0);
		System.out.println("���ε������"+s2.area());
		System.out.println("���ε��ܳ���"+s2.perimeter());
		
		S1 ss = new S1();
		ss.email();
		
		Show show = new Show();
		//�ӿڽ������滻����
		show.print(new Circle(10.0));
		show.print(new Rectangle(12.0,15.0));

	}
}
