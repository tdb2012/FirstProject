package com.test;

/**
 * 兔子问题 
 * 斐波那契数列求值
 * @author Fate 有一对兔子，从出生后第3个月起每个月都生一对兔子(一公一母)， 
 * 小兔子长到第3个月后每个月又生一对兔子，假如兔子都不死，
 * 问每个月的兔子总数为多少？ 
 * 程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21….    
 * 通过观察我们发现：假设这个数列有n>2项，则有An=A(n-1) +A(n-2);
 */
public class Fx {
	public static void main(String[] args) {

		int months = 25;// 月数

		for (int month = 1; month <= months; month++) {
			// 当月兔子数
			int count = Rabbit(month);
			// 打印出当月兔子数
			System.out.println("第" + month + "个月有" + count + "只兔子");
		}
	}

	public static int Rabbit(int month) {
		if (month == 1 || month == 2) {
			return 1;
		} else {
			return Rabbit(month - 1) + Rabbit(month - 2);
		}
	}
}
