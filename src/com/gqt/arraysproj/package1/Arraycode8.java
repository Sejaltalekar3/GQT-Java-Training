package com.gqt.arraysproj.package1;
import java.util.Arrays;
//write a program the given array 
// arr[]=23,45,11,32,15,77,61,5,1
public class Arraycode8 {

	public static void main(String[] args) {
		int arr[]= {23,45,11,32,15,77,61,5,1};
		//arrays are built in class that is available inside the util package
Arrays.sort(arr);
for(int  i=0;i<arr.length;i++){
	System.out.print(arr[i]+" ");
}
	}
}
