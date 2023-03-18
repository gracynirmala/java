package gracy.com;
import  java.util.Scanner;
	public class Example {
	    public static void main(String[] args) {
	    	System.out.println("enter age");
	        Scanner sc = new Scanner(System.in);
	        int age = sc.nextInt();
	        
	        if(age>=0&&age<=11){
	            System.out.println("child");
	        }else if(age>=12&&age<=64){
	            System.out.println("Teen");
	        }else if(age>=18&&age<=64){
	            System.out.println("Adult");
	        }
	        
	    }
	}
