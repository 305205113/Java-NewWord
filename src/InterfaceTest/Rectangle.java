package InterfaceTest;

public class Rectangle implements Shape {
	double width;
	double height;
	public Rectangle(double width,double height){
		this.width = width;
		this.height = height;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * (width + height);
	}
	

}
