package Salary;

public class VirtualDemo {
	public static void main(String[] args) {
		Salary s = new Salary("Ī����","������",2,3600.00);
		Employee e = new Salary("ϣ����","ŵ����˹",3,3300.00);
		System.out.println("ʹ��Salary�����õ���mailCheck---");
		s.mailCheck();
		System.out.println("\nʹ��Employee�����õ���mailcheck---");
		e.mailCheck();
	}
}
