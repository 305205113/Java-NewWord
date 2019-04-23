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
		//先去d赋值给A，d在自加
		int A = d++;
		System.out.println("d = "+d);
		System.out.println("A = "+A);
		
		//d先自加，在赋值给B
		int B = ++d;
		System.out.println("d = "+d);
		System.out.println("B = "+B);
		
		//&所有条件都会执行
		//if (1==2 & 1/0 ==0)
		//&&依次判断所有条件，只有某个条件为false则不判断后续条件返回false
		if (1==2 && 1/0 ==0) {
			System.out.println("条件成了");
		}
		//|所有条件都会执行
		//if (1==1 | 1/0==0)
		//||依次判断所有条件，当某个条件为true则不继续判断返回true
		if (1==1 || 1/0==0) {
			System.out.println("条件成了");
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
		
		//如果判断条件为true则返回表达式1的值，否则返回表达式2的值。
		String mark = (a<=10)? "对的":"不对";
		System.out.println(mark);
		
		while (a<20) {
			System.out.println("Value of a:"+a);
			a++;
		}
		
		//先执行一次，在进行判断
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
				//跳出最里层循环
				break;
			}
			y++;
		}
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%2 == 0) {
				//结束本次循环，不执行后续语句，执行下次循环
				continue;
			}
			sum +=i;
		}
		System.out.println("sum = "+sum);
		
	}
}