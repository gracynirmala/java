package com.gracy;

import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		int num,count=0;
		Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=Sc.nextInt();
        for(int i=1;i<=num;i++) {
        	  if(num%i==0) { 
        		count=count+1;
        	  }  
        	
            }
                if(count==2) {
        	          System.out.println(num+"is a prime number");
                         }
                       else {
        	           System.out.println(num+"is not a prime number");
                         }
        	}
	}

