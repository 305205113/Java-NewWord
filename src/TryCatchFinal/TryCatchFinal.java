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
	 * try-catch捕获while循环
	 * 如果：捕获异常，打印输出并返回-1
	 * 否则：返回result
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
	 * try-catch捕获while循环
	 * 如果：捕获异常，打印输出并返回999
	 * 否则：返回result
	 * finally:打印输出result
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
			//可在finally语句块中释放资源如断开数据库链接，网络请求断开等
			
			System.out.println("This is funally");
			System.out.println(result);
		}
	}
	
	
	/*
	 * Divider
	 * result
	 * try-catch捕获while循环
	 * 如果：捕获异常
	 * 否则：返回result
	 * finally:打印输出result
	 * 最后返回1111
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
