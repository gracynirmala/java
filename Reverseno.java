package com.gracy;

import java.util.Scanner;

public class Reverseno {

	public static void main(String[] args) {
		int num ,digit,rev=0,copynum;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=Sc.nextInt();
		copynum=num;
		while(num!=0) {
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println("Reverse number is "+rev);
		if(rev==copynum) {
			System.out.println("Given number is pallandrome");
		}
		else {
			System.out.println("Given number is not pallandrome");
		}
	}

}
