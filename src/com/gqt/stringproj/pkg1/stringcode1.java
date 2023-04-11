/*
 * strings in java re used for representing the series of character,
 * strings in java are the built-in class which is present inside the package names as "java.lang"
 * strings in java do not end with null character
 * strings in java are 2 types
 * 1.mutable strings
 * strings that can be altered once created
 * It is represented using stringBuffer and string Buffer
 * 
 * 2.immutable
 * strings that cannot be altered once created
 * It is represented using string class.
 * 
 * different ways to create immutable strings
 * 1.using literal
 * the memory for literal based representation will be create in constant pool of  string pool in the heap segment.
 * the constant pool duplication of the data is not permitted rather then existing data will be utilized
 * 
 * 2.using object
 * the memory for literal based representation will be create in  non-constant pool of  string pool in the heap segment.
 *  the non-constant pool duplication of the data is permitted .
 *  
 *  different ways to compare the string
 *  1.using equals() to compare the contents of the string
 *  2. using == to compare the addresses
 *  3.using equalsIgnore() to compare the contents of the string by ignoring the cases
 *  4.using compareTo() to compare the contents of the string
 */


package com.gqt.stringproj.pkg1; 

public class stringcode1 {
	public static void main(String[] args) {
		//using literal
		String s1="Ramayana";
		
		//using the object
		String s2= new String ("mahabharata");
		
		System.out.println(s1);
		System.out.println(s2);
	}
}