
package com.edu;

import java.util.Scanner;

public class LargestTwo {

	public static void main(String[] args) {
		int num1,num2, large;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number");
		num1=sc.nextInt();
		System.out.println("Enter second number");
		num2=sc.nextInt();
		
		/*if(num1>num2) {
			System.out.println("The largest of "+num1+" and "+num2+" is "+num1);
		}
		else {
			System.out.println("The largest of "+num1+" and "+num2+" is "+num2);
		}*/
		
		large=(num1>num2)?num1:num2; //using ternary operator
		System.out.println("The largest of "+num1+" and "+num2+" is "+large);
		
    }
}