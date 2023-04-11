/*
 * (i)     (j)		(k)
 * school	class	students
 * 0		0		2
 * 			1		3
 * 1		0		3
 * 			1		4
 * 			2		5
 */
package com.gqt.arraysproj.package1;
import java.util.Scanner;

public class Arraycode6 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);

		System.out.println("Enter the count of schools: ");

		int scl= sc.nextInt();
		int  arr[][][]=new int [scl][][];  //three dimensional jagged array
		//taking the count
		for(int i=0;i<arr.length;i++) {

		System.out.println("Enter the count of students inside the school: "+(i+1)); 
		 arr[i]=new int[sc.nextInt()][];
		}
		//taking the students
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside school: "+(i+1)); 
			for(int j=0;j<arr.length;j++) {
				System.out.println("enter the count of students inside class : "+(j+1));  
			 arr[i][j]= new int [sc.nextInt()];
		}
			}
		//storing the marks
		for(int i=0;i<arr.length;i++) {

		System.out.println("Inside school :"+ (i + 1) ) ;

		for(int j=0;j<arr.length;j++) {

		System.out.println("inside class: ="+ (j + 1) ); 
		for(int k=0;k<arr.length;k++) {
			System.out.println("Enter marks of student no: "+(k+1)); 
		arr[i][j][k] = sc.nextInt();

		}
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