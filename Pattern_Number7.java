package com;

import java.util.Scanner;

public class Pattern_Number7 {

	public static void main(String[] args) {
		System.out.println("Input : ");
		Scanner sc=new Scanner(System.in);
		int noOfRows=sc.nextInt();
		for(int row=noOfRows; row>=1; row--) {
			for(int column=noOfRows; column>=row; column--) {
				System.out.print(column+" ");
			}
			System.out.println();
		}

	}

}