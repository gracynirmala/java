package com.gracy;
import java.util.Scanner;
public class Railwayticket {
	String name;
	String coach;
	long mobno;
	int amount;
	int totalamt;
	Railwayticket(){
		name="";
		coach="";
		mobno=0;
		int amount=0;
		int totelamt=0;
	}
	
	void Accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer name:");
		name=sc.nextLine();
		System.out.println("Enter which coach you want:");
		coach=sc.nextLine();
		System.out.println("Enter mobile no:");
		mobno=sc.nextLong();
		
	}
	void Update() {
		if(coach.equals("First_AC")) {
			System.out.println(totalamt=(amount+700));
		}
		else if(coach.equals("Second_AC")) {
			System.out.println(totalamt=(amount+500));
		}
		else if(coach.equals("Third_AC")) {
			System.out.println(totalamt=(amount+700));
		}
		else if(coach.equals("sleeper")) {
			System.out.println(totalamt=amount);
		}
		
		}
	
	public static void main(String args[]) {
		Railwayticket ob=new Railwayticket();
		ob.Accept();
		ob.Update();
		ob.display();
	}
	void display() {
		System.out.println(" Name :"+name);
		System.out.println("mobile no:"+mobno);
		System.out.println("coach:"+coach);
		System.out.println("Totel Amount:"+amount);
		
	}

}
