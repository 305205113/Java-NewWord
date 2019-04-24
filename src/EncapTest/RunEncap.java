package EncapTest;

public class RunEncap {
	public static void main(String[] args) {
		EncapTest encap = new EncapTest();
		encap.setName("贾科斯");
		encap.setIdNum("54");
		encap.setAge(14);
		System.out.println(encap.getName()+"获得了"+encap.getIdNum()+"以及金币"+encap.getAge()+"万");
		
	}
}
