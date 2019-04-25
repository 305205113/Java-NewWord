package InterfaceTest;

public class Circle implements Shape {
	double redius;
	
	public Circle(double redius){
		this.redius = redius;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * redius * redius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * redius;
	}

}
