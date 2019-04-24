package External;

public class PartInternalClass {
	private void internalTracking(boolean b){
		if(b){
			//局部内部了
			class TrackingSlip{
				private String id;
				TrackingSlip(String s){
					id = s;
				}
				String getSlip(){
					return id;
				}
			}
			TrackingSlip ts = new TrackingSlip("chenssy");
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
