package com.test;

import java.util.Scanner;

public class StringJiequ {

	public static void main (String[]  args){
		Scanner sc=new Scanner (System.in);
		System.out.println("请输入字符串");
		String str=sc.nextLine();
		System.out.println("请输入你想查询的字符的位置");
		int m=sc.nextInt();
		System.out.println("实现在一个指定的位置查找字符："+str.charAt(m));
		System.out.println("请输入你要查询的元素");
		String n=sc.nextLine();
		System.out.println("输出字符在字符串中出现的位置：" + str.indexOf(n));
		}
}
