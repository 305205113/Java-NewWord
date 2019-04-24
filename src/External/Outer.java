package External;

public class Outer {
	public void showOuter(){
		System.out.println("this is external class");
	}

	public class Inner{
		public void showInner(){
			System.out.println("this is internal class");
		}
	}
}
