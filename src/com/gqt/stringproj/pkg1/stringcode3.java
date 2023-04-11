package com.gqt.stringproj.pkg1;

public class stringcode3 {
	public static void main(String[] args) {
		String s1="global";
		String s2="quest";
		
		if (s1==s2) {
			System.out.println("addresses are equal");
		}
		else {
			System.out.println("addresses are not equal");
		}																//non constant (both pointing to the same address)
}	
}
