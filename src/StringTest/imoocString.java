package StringTest;

import java.net.StandardSocketOptions;

public class imoocString {
	public static void main(String[] args){
		String str = new String("  i-love-������-He-is-my-son");
		System.out.println(str.length());
		System.out.println(str.indexOf("��"));
		System.out.println(str.indexOf("����"));
		System.out.println(str.lastIndexOf("��"));
		System.out.println(str.lastIndexOf("һ�쵽��"));
		System.out.println(str.substring(7));
		System.out.println(str.subSequence(1, 7));
		System.out.println(str.trim());
		System.out.println(str.equals(new String("�����Ұ�������")));
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
			System.out.println("Java�ļ�����ȷ");
			
		}else{
			System.out.println("Java�ļ�����Ч");
		}

		int index2 = email.indexOf("@");
		int index3 = email.indexOf(".");
		if(index2 !=-1 && index3>index2){
			System.out.println("�����ʽ��ȷ");
		}else{
			System.out.println("�����ʽ����");
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
