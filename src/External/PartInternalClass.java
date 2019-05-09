package External;

public class PartInternalClass {
	//�����е��ڲ���
	private void internalTracking(boolean b){
		if(b){
			/*
			 * �����ڲ��಻�����ⲿ�෽������ĵط�����
			 * ������ʹ�÷��ʿ��Ʒ���static
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
			//���÷����ڲ���Ĺ��췽����������
			TrackingSlip ts = new TrackingSlip("chenssy");
			//���÷����ڲ���ķ���
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
