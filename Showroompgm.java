package Showroom;

import java.util.Scanner;
public class Showroompgm {

	       String name;
	       double mobileno;
	       double cost;
	       double dis;
	       double amount;
	       
	       Showroompgm(){
	    	   name="";
	    	   mobileno=0;
	    	   cost=0;
	    	   dis=0;
	    	   amount=0;
	    	 }

	       void input() {
	   		Scanner sc=new Scanner(System.in);
	   		System.out.println("Enter customer name");
	   		name=sc.nextLine();
	   		System.out.println("Enter mobile no");
	   		mobileno=sc.nextLong();
	   		System.out.println("Enter the cost");
	   		cost=sc.nextDouble();
	   		
	   	}
	   	
	   	void calculate() {
	   		if(cost<=10000) {
	   			dis=(cost*5)/100; //ex cost=15000 , dis=15000*5/100=750
	   		}
	   		else if(cost>10000 && cost<=20000) {
	   			dis=(cost*10)/100;
	   		}
	   		else if(cost>20000 && cost<=35000) {
	   			dis=(cost*15)/100;
	   			
	   		}
	   		else if(cost>35000) {
	   			dis=(cost*20)/100;
	   		}
	   		amount=cost-dis;
	   	}

	   	void display() {
	   		System.out.println("Customer name="+name);
	   		System.out.println("Customer mobile no "+mobileno);
	   		System.out.println("Amount to be paid after discount "+amount);
	   	}
	   	public static void main(String[] args) {
	   		Showroompgm sobj=new Showroompgm();
	   		sobj.input();
	   		sobj.calculate();
	   		sobj.display();

	   	}

	   }


