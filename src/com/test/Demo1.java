package com.test;
import java.util.Scanner;
import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
		/*
		int classNum = 3;
		int stuNum = 4;
		double sum = 0;
		double avg = 0;
		Scanner input = new Scanner(System.in);
		for(int i = 1;i <= classNum;i++){
			System.out.println("请输入第"+i+"个班级成绩");
			for(int j = 1;j <= stuNum;j++){
				System.out.println("请输入"+j+"个学生成绩");
				int scroe = input.nextInt();
				sum += scroe;
			}
			avg = sum/stuNum;
			System.out.println("第"+i+"个班级学生的平均分为："+avg);
			sum = 0;
		}
		*/
		int[] scores = {89,-23,64,91,119,52,73};
		Demo1 demo = new Demo1();
		demo.printScores(scores);
	}
	
	public void printScores(int[] scores){
		Arrays.sort(scores);
		int num = 0;
		for(int i = scores.length-1;i>0;i--){
			if(scores[i]>100 || scores[i]<0)
			{
				continue;
			}
			num++;
			if(num>3){
				break;
			}
			System.out.println(scores[i]);
		}
	}
	
	
}
