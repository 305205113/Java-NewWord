package Salary;

public class Salary extends Employee {
	private double salary;
	public Salary(String name, String address, int number,double salary) {
		super(name, address, number);
		setSalary(salary);
	}
	
	private void setSalary(double newSalary) {
		
		
	}

	public double getSalary(){
		return salary;
	}

}
