package External;

public class TestOuter {
	public static void main(String[] args) {
		Outer.Inner ic = new Outer().new Inner();
		ic.showInner();
	}
}
