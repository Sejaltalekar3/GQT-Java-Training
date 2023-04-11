package com.gqt.stringproj.pkg1;

public class stringcode5 {
	public static void main(String[] args) {
		String s1="Global";
		String s2="gloBaL";
		
		if (s1.compareTo(s2)==0) {
			System.out.println("strigs are equal");
		}
		else {
			System.out.println("strings are not equal");
}	
}
}


/*    G		l	o	b	a	l
	 71	108	111	98	97	108

g	l	o	B 	a	L			difference -32 not equal
103	108	111	66	97	76
*/