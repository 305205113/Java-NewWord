package StringTest;

import java.net.StandardSocketOptions;

public class imoocString {
	public static void main(String[] args){
		String str = new String("  i-love-臭唐唐-He-is-my-son");
		System.out.println(str.length());
		System.out.println(str.indexOf("臭"));
		System.out.println(str.indexOf("唐唐"));
		System.out.println(str.lastIndexOf("臭"));
		System.out.println(str.lastIndexOf("一天到晚"));
		System.out.println(str.substring(7));
		System.out.println(str.subSequence(1, 7));
		System.out.println(str.trim());
		System.out.println(str.equals(new String("但是我爱臭唐唐")));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.charAt(7));
		for(int i = 0;i < str.split("-").length;i++){
			System.out.println(str.split("-")[i]);
		}
		
		for(int i = 0;i < str.getBytes().length;i++){
			System.out.println(str.getBytes()[i]);
		}
		
		String fileName = "HelloWord.java";
		String email = "wudier@immoc.com";
		
		int index = fileName.indexOf(".");
		String prefix = fileName.substring(index);
		
		if(index > 0 && prefix.equals(".java")){
			System.out.println("Java文件名正确");
			
		}else{
			System.out.println("Java文件名无效");
		}

		int index2 = email.indexOf("@");
		int index3 = email.indexOf(".");
		if(index2 !=-1 && index3>index2){
			System.out.println("邮箱格式正确");
		}else{
			System.out.println("邮箱格式错误");
		}
		
		String s = "asdjasdlasfksdofuasdakasdlasdisdhfsldfsdf";
		int num = 0;
		
		for(int i= 0;i<s.length();i++){
			if (s.charAt(i)=='a'){
				num++;
			}
		}
		System.out.println(num);
	}
}
