package StringTest;

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
		System.out.println(str.split("-")[0]);
		for(int i = 0;i < str.getBytes().length;i++){
			System.out.println(str.getBytes()[i]);
		}

		
	}
}
