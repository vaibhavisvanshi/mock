package com.demo.mock;

import java.util.Scanner;

/*
 * 
 * 1.count occurrence of a given character in String?
 * 
 * */
public class Practice1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Character c = str.charAt(0);
		String s = sc.next();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				count++;
			}
		}
		sc.close();
		System.out.println(count);
	}

}
