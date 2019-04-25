package com.abstractTest;

public class ShapesTest {
	public static void main(String[] args) {
		Circle c1 = new Circle(1.0);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		
		Square s1 = new Square(5,7);
		System.out.println(s1.getArea());
		System.out.println(s1.getPerimeter());
//		Circle c1 = new ShapesTest().new Circle(1.0);
//		System.out.println("圆形的面积为"+c1.getArea());
//		System.out.println("圆形的周长为"+c1.getPerimeter());
//		
//		Square s1 = new ShapesTest().new Square(2,3);
//		System.out.println("长方形的面积为"+s1.getArea());
//		System.out.println("长方形的周长为"+s1.getPerimeter());
	}
	
	
	
}

abstract class Shapes{
	public abstract double getArea();
	public abstract double getPerimeter();
}

class Circle extends Shapes{
	double r;
	public Circle(double r){
		this.r = r;
	}
	public double getArea(){
		return r * r * Math.PI;
	}
	public double getPerimeter(){
		return 2 * Math.PI * r;
	}
}

class Square extends Shapes{
	int width;
	int height;
	public Square(int width,int height){
		this.width = width;
		this.height = height; 
	}
	public double getArea(){
		return width * height;
	}
	public double getPerimeter(){
		return 2 * (width + height);
	}
}



