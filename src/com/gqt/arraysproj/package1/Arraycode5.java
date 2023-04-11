/*
 * (i)				(j)
 * class			student
 * 1				4
 * 2				5		
 * 3				6
 */



package com.gqt.arraysproj.package1;
import java.util.Scanner;

public class Arraycode5 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);

		System.out.println("Enter the count of classes: ");

		int cls = sc.nextInt();
		int  arr[][]=new int [cls][];  //two dimensional jagged array
		for(int i=0;i<arr.length;i++) {

		System.out.println("Enter the count of students inside the class: "+(i+1)); 
		 arr[i]=new int[sc.nextInt()];
		}
		//storing the marks
		for(int i=0;i<arr.length;i++) {

		System.out.println("Inside class :"+ (i + 1) ) ;

		for(int j=0;j<arr.length;j++) {

		System.out.println("Enter marks of student no: ="+ (j + 1) ); 
		arr[i][j] = sc.nextInt();

		}
		
	}
//fetching marks
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside class :"+ (i + 1) ) ;
			for(int j=0;j<arr.length;j++) {
			System.out.println("the marks of student no:"+(j+1)+"is :"+arr[i][j]);
		}
	}
}
}