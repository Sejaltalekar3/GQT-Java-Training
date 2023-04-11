package com.gqt.stringproj.pkg1;

import java.util.Scanner;

//wap to reverse the given string and check if it is a palnindrome or not
public class stringcode14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		
		String str2="";
		for (int i=str.length()-1;i>=0;i--) {
			str2=str2+str.charAt(i);
		}
		if(str.equals(str2)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println(" not a palindrome");
		}
	}
}
