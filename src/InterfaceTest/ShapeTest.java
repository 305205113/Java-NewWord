package InterfaceTest;

public class ShapeTest {
	public static void main(String[] args) {
		Shape s1 = new Circle(10.0);
		System.out.println("圆的面积是"+s1.area());
		System.out.println("圆的周长是"+s1.perimeter());
		
		Shape s2 = new Rectangle(5.0,10.0);
		System.out.println("矩形的面积是"+s2.area());
		System.out.println("矩形的周长是"+s2.perimeter());
		
		S1 ss = new S1();
		ss.email();
		
		Show show = new Show();
		//接口将参数替换成类
		show.print(new Circle(10.0));
		show.print(new Rectangle(12.0,15.0));

	}
}
