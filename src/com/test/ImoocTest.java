package com.test;
import java.util.Scanner;
public class ImoocTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		int count = 0;
		while(score <60){
			score++;
			count++;
		}
		System.out.println(score+"*"+count);
		
	}
}
