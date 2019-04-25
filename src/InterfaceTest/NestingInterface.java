package InterfaceTest;

import InterfaceTest.NestingClass.Dimp;

public class NestingInterface {
	public static void main(String[] args) {
		NestingClass a = new NestingClass();
		
		NestingClass a2 = new NestingClass();
		a2.receiveD(a.getD());
		
		//NestingClass sa = new NestingClass().getD();
		NestingClass.Dimp d = (Dimp) a.getD();
		d.f();
		System.out.println(d);
		System.out.println(d);
	}
}

class NestingClass {
	private interface D{
		void f();
	}
	
	private class DImp1 implements D {
		public void f(){
			System.out.println("Surprise mother fcuke too");
		}
	}
	
	public class Dimp implements D{
		public void f(){
			new DImp1().f(); 
			System.out.println("Surprise mother fcuke");
		}
	}
	
	public D getD(){
		return new Dimp();
	}
	
	private D dRef;
	
	public void receiveD(D d){
		dRef = d;
		dRef.f();
		System.out.println("this is a alert");
		System.out.println(dRef);
	}
}
