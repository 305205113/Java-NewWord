package com.test;

public class Operator {
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		int c = 25;
		System.out.println("a + b = "+(a+b));
		System.out.println("a - b = "+(a-b));
		System.out.println("a * b = "+(a*b));
		System.out.println("b / a = "+(b/a));
		System.out.println("b % a = "+(b%a));
		System.out.println("c % a = "+(c%a));
		
		int d = 20;
		//��ȥd��ֵ��A��d���Լ�
		int A = d++;
		System.out.println("d = "+d);
		System.out.println("A = "+A);
		
		//d���Լӣ��ڸ�ֵ��B
		int B = ++d;
		System.out.println("d = "+d);
		System.out.println("B = "+B);
		
		//&������������ִ��
		//if (1==2 & 1/0 ==0)
		//&&�����ж�����������ֻ��ĳ������Ϊfalse���жϺ�����������false
		if (1==2 && 1/0 ==0) {
			System.out.println("��������");
		}
		//|������������ִ��
		//if (1==1 | 1/0==0)
		//||�����ж�������������ĳ������Ϊtrue�򲻼����жϷ���true
		if (1==1 || 1/0==0) {
			System.out.println("��������");
		}
		
		a+=b;
		System.out.println("a="+a);
		a-=b;
		System.out.println("a="+a);
		a*=b;
		System.out.println("a="+a);
		a/=b;
		System.out.println("a="+a);
		a%=b;
		System.out.println("a="+a);
		
		//����ж�����Ϊtrue�򷵻ر��ʽ1��ֵ�����򷵻ر��ʽ2��ֵ��
		String mark = (a<=10)? "�Ե�":"����";
		System.out.println(mark);
		
		while (a<20) {
			System.out.println("Value of a:"+a);
			a++;
		}
		
		//��ִ��һ�Σ��ڽ����ж�
		int x = 1;
		do {
			System.out.println("x = "+x);
			x++;
			
		} while (x <= 4);
		
		for (int i = 0; i < 20; i++) {
			System.out.println("i = "+i);
		}
		
		int[] numbers ={10,20,30,40};
		for (int p : numbers) {
			System.out.println(p);
		}
		
		String[] names = {"a","b","c"};
		for (String string : names) {
			System.out.println(string);
		}
		
		int y = 1;
		while (y <= 4) {
			System.out.println("y = "+y);
			if(y == 3){
				//���������ѭ��
				break;
			}
			y++;
		}
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%2 == 0) {
				//��������ѭ������ִ�к�����䣬ִ���´�ѭ��
				continue;
			}
			sum +=i;
		}
		System.out.println("sum = "+sum);
		
	}
}