package TryCatchFinal;

public class TryCatchFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchFinal tryCatch =new TryCatchFinal();
		System.out.println("*****"+tryCatch.test(100,10)+"*****");
		System.out.println("-----"+tryCatch.test2(100,10)+"-----");
		System.out.println("#####"+tryCatch.test3()+"#####");
	}
	
	/*
	 * Divider
	 * result
	 * try-catch����whileѭ��
	 * ����������쳣����ӡ���������-1
	 * ���򣺷���result
	 */
	public int test(int devider,int result){
		try {
			while(devider > -1){
				devider--;
				result = result +100/devider;
			}
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("extraordinarily");
			// TODO: handle exception
			return -1;
		}
		
	}
	
	/*
	 * Divider
	 * result
	 * try-catch����whileѭ��
	 * ����������쳣����ӡ���������999
	 * ���򣺷���result
	 * finally:��ӡ���result
	 */
	public int test2(int devider,int result){
		try {
			while(devider > -1){
				devider--;
				result = result +100/devider;
			}
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
			System.out.println("extraordinarily");
			return result = 999;
		}finally{
			//����finally�������ͷ���Դ��Ͽ����ݿ����ӣ���������Ͽ���
			
			System.out.println("This is funally");
			System.out.println(result);
		}
	}
	
	
	/*
	 * Divider
	 * result
	 * try-catch����whileѭ��
	 * ����������쳣
	 * ���򣺷���result
	 * finally:��ӡ���result
	 * ��󷵻�1111
	 */
	public int test3(){
		int divider = 10;
		int result = 100;
		try {
			while(divider > -1){
				divider--;
				result = result +100/divider;
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
			System.out.println("extraordinarily");
		}finally{
			System.out.println("This is funally");
			System.out.println(result);
		}
		return 1111;
	}

}
