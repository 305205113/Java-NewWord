package TryCatchFinal;

public class CustmoException extends Exception {
	public CustmoException(){
		
	}
	
	//自定义异常
	public CustmoException(String message){
		super(message);
	}
}
