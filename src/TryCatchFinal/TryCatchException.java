package TryCatchFinal;

public class TryCatchException {
	/*
	 * test1():
	 * test2():
	 * main():
	 */
	public static void main(String[] args){
		TryCatchException exc = new TryCatchException();
		try {
			exc.test2();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void test1() throws CustmoException{
		throw new CustmoException("if you drunk you mast don't drive");
	}
	
	public void test2(){
		try {
			test1();
		} catch (Exception e) {
			// TODO: handle exception
			RuntimeException newExc = new RuntimeException("Driver a drop of wine£¬Two tears of loved ones");
			newExc.initCause(e);
			throw newExc;
		}
	}
}
