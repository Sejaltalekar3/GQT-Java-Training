package com.gqt.arraysproj.package1;
import java.util.Scanner;

public class Arraycode7{

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);

		System.out.println("Enter the count of universities: ");

		int uni= sc.nextInt();
		int  arr[][][][]=new int [uni][][][];  //four dimensional jagged array
		//taking the count of college
		for(int i=0;i<arr.length;i++) {

		System.out.println("Enter the count of colleges inside the university: "+(i+1)); 
		 arr[i]=new int[sc.nextInt()][][];
		}
		//taking the count of the classrooms
		for(int i=0;i<arr.length;i++) {

			System.out.println("Enter the count of classrooms inside the college: "+(i+1)); 
			 arr[i]=new int[sc.nextInt()][][];
			}
		//taking the students
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside school: "+(i+1)); 
			for(int j=0;j<arr.length;j++) {
				System.out.println("enter the count of students inside class : "+(j+1));  
			 arr[i][j]= new int [sc.nextInt()][];
		}
			}
		//storing the marks
		for(int i=0;i<arr.length;i++) {

		System.out.println("Inside class university 1 :"+ (i + 1) ) ;

		for(int j=0;j<arr.length;j++) {

		System.out.println("inside class univeity 2: ="+ (j + 1) ); 
		for(int k=0;k<arr.length;k++) {
			System.out.println("Enter marks of student no: "+(k+1)); 
			for(int l=0;k<arr.length;l++) {
				System.out.println("Enter marks of student no: "+(l+1)); 
		arr[i][j][k][l] = sc.nextInt();

		}
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