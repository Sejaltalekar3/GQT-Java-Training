package com.gqt.stringproj.pkg1;
//what do you mean by the statement "immutable strings cannot be changed" 
public class stringcode7 {
	public static void main(String[] args) {
		String s1="sita";
		String s2="ravana";
		//s1.concat(s2);//immutable
		s1=s1.concat(s2);
		//forcefully stores under the LHS thats when it combines(concatinates)
		System.out.println(s1);
	}
}
