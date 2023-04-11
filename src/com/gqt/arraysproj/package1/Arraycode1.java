package com.gqt.arraysproj.package1;
import java.util.Scanner;
public class Arraycode1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the count of the students:");
		int n=sc.nextInt();
		int arr[] = new int[n]; //one dimensional array
		//storing the data
		for(int i=0;i<=n-1;i++) {
			System.out.println("enter the marks of the student no:"+(i+1));
			arr[i]=sc.nextInt();
			}
		System.out.println("###---- marks added----####");
		//fetching the data
		for(int i=0;i<=n-1;i++) {
			System.out.println("the mark of student no:"+(i+1)+"is ="+arr[i]);
		}

	}

}
