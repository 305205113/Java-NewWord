package ConstructBlock;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ConstructBlock {
	String name;
	String sex;
	String location;
	static String idCar; 
	static int age;
	//�޲ι��췽��
	public ConstructBlock(){
		System.out.println("****�޲ι��췽��****");
		System.out.println("��������ʱNEW֮����õľ��ǹ��췽��");
		name = "�²���";
	}
	//�вι��췽��
	public ConstructBlock(String newName,String newSex,int newAge){
		System.out.println("****�вι��췽��****");
		System.out.println("���췽�����ظı�������͡�������˳��");
		System.out.println("����(�вε�)���췽����ҪĿ�ľ��Ǹ���Ա������ֵ");
		this.name = newName;
		this.sex = newSex;
		this.age = newAge;
	}
	
	//��ʼ����
	{
		System.out.println("****��ʼ����****");
		System.out.println("һ������԰��������ʼ����,���������ʵ��ʱ�ͻ�ִ�г�ʼ����");
		System.out.println("��ʼ������Ը���Ա������ֵ");
		this.sex = "�������";
		this.location = "������";
	}
	
	//��̬��ʼ����
	static {
		System.out.println("****��̬��ʼ����****");
		System.out.println("��̬��ʼ����ֻ�������ʱִ����ִֻ��һ��");
		System.out.println("��̬��ʼ����ֻ�ܸ���̬������ֵ");
		ConstructBlock.idCar = "���ﹶ˹";
	}
	
	
	public void show(){
		System.out.println(name+age+location+sex+idCar);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructBlock construct = new ConstructBlock();
		/*
		 * ����ִ�о�̬�����
		 * ���ִ����ͨ�����
		 * ���ִ�й��췽��
		 */
		construct.show();
	}

}
