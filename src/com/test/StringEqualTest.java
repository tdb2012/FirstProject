package com.test;

public class StringEqualTest {
	public static void main(String[] args) {
		String s1 = "Programming";
		String s2 = new String("Programming");
		String s3 = "Program" + "ming";
		System.out.println(s1 == s2);// false
		System.out.println(s1 == s3);// true
		System.out.println(s1 == s1.intern());// true
		// intern检查字符串池里是否存在"abc"这么一个字符串，
		// 如果存在，就返回池里的字符串；
		// 如果不存在，该方法会把"abc"添加到字符串池中，然后再返回它的引用。
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

	}
}
