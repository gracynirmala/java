package com.gracy;

public class GeneratePrimeno {

	public static void main(String[] args) {
	 int c=0, n=0;
	 System.out.println("Prime numbers between 1to 1000");
	 for(int i=2;i<=1000;i++)  {
			 c=0;
			 for(int j=1;j<=i;j++) {
				 if(i%j==0) {
					 c=c+1;
				 }
			 }
		
     if(c==2) {
    	 n++;
    	 System.out.println(i+",");
     }
	}
	System.out.println("Totel number of prime numbers between 1 to 1000 "+n);
	 }
	}

