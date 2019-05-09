package External;

public class PartInternalClass {
	//方法中的内部类
	private void internalTracking(boolean b){
		if(b){
			/*
			 * 方法内部类不能在外部类方法意外的地方访问
			 * 不可以使用访问控制符和static
			 */
			class TrackingSlip{
				private String id;
				TrackingSlip(String s){
					id = s;
				}
				String getSlip(){
					return id;
				}
			}
			//调用方法内部类的构造方法创建对象
			TrackingSlip ts = new TrackingSlip("chenssy");
			//调用方法内部类的方法
			String string = ts.getSlip();
			System.out.println(string);
		}
	}
	
	public void track(){
		internalTracking(true);
	}
	
	public static void main(String[] args) {
		PartInternalClass part = new PartInternalClass();
		part.track();
	}
}
