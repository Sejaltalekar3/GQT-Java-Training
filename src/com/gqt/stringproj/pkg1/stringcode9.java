package com.gqt.stringproj.pkg1;

public class stringcode9 {
		public static void main(String[] args) {
			StringBuilder sb1 =new StringBuilder("sita");
			StringBuilder sb2 =new StringBuilder("rama");
			sb1.append(sb2);
			System.out.println(sb1);
		}
	}


/*
 * difference between  StringBuffer and StringBuilder
 * 													|
 * 				StringBuffer						|								StringBuilder
 * 	__________________________________________	    |		_________________________________________________				
 * 		1.used to handle mutable strings			|					1.used to handle mutable strings
 * 		2.initial capacity is 16					|					2.initial capacity is 16
 * 		3.introduced in java 1.0					|					3.introduced in java 1.5
 * 		4.race condition does not ocuur				|					4.race condition  ocurs
 * 		5.it is thread safe							|					5.it is not  thread safe
 * 		6.t is synchronized 						|					6.t is  not synchronized 
 * 													|
 */