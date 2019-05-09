package ConstructBlock;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ConstructBlock {
	String name;
	String sex;
	String location;
	static String idCar; 
	static int age;
	//无参构造方法
	public ConstructBlock(){
		System.out.println("****无参构造方法****");
		System.out.println("创建对象时NEW之后调用的就是构造方法");
		name = "奥伯龙";
	}
	//有参构造方法
	public ConstructBlock(String newName,String newSex,int newAge){
		System.out.println("****有参构造方法****");
		System.out.println("构造方法重载改变参数类型、个数、顺序");
		System.out.println("重载(有参的)构造方法主要目的就是给成员变量赋值");
		this.name = newName;
		this.sex = newSex;
		this.age = newAge;
	}
	
	//初始化块
	{
		System.out.println("****初始化块****");
		System.out.println("一个类可以包含多个初始化块,当创建类的实例时就会执行初始化块");
		System.out.println("初始化块可以给成员变量赋值");
		this.sex = "耐萨里奥";
		this.location = "艾萨拉";
	}
	
	//静态初始化块
	static {
		System.out.println("****静态初始化块****");
		System.out.println("静态初始化块只在类加载时执行切只执行一次");
		System.out.println("静态初始化快只能给静态变量赋值");
		ConstructBlock.idCar = "玛里苟斯";
	}
	
	
	public void show(){
		System.out.println(name+age+location+sex+idCar);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructBlock construct = new ConstructBlock();
		/*
		 * 首先执行静态构造块
		 * 其次执行普通构造块
		 * 最后执行构造方法
		 */
		construct.show();
	}

}
