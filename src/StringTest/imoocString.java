package StringTest;

public class imoocString {
	public static void main(String[] args){
		String str = new String("  i-love-³ôÌÆÌÆ-He-is-my-son");
		System.out.println(str.length());
		System.out.println(str.indexOf("³ô"));
		System.out.println(str.indexOf("ÌÆÌÆ"));
		System.out.println(str.lastIndexOf("³ô"));
		System.out.println(str.lastIndexOf("Ò»Ììµ½Íí"));
		System.out.println(str.substring(7));
		System.out.println(str.subSequence(1, 7));
		System.out.println(str.trim());
		System.out.println(str.equals(new String("µ«ÊÇÎÒ°®³ôÌÆÌÆ")));
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
