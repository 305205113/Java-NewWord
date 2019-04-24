package Salary;

public class VirtualDemo {
	public static void main(String[] args) {
		Salary s = new Salary("莫甘娜","瓦罗兰",2,3600.00);
		Employee e = new Salary("希瓦纳","诺克萨斯",3,3300.00);
		System.out.println("使用Salary的引用调用mailCheck---");
		s.mailCheck();
		System.out.println("\n使用Employee的引用调用mailcheck---");
		e.mailCheck();
	}
}
