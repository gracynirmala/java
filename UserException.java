package gracy.com;

import java .util.Scanner;
class AgeException extends Exception{
	public AgeException(String s) {
		super(s);
	}
}
class voterAge{
	void CheckAge(int age) {
		try {
			if(age<18) {
				AgeException ob=new AgeException ("Not Eligible for voting");
				throw ob;
			}
			else {
				System.out.println("Eligible for voting");
			}
		}
			catch(AgeException e) {
				e.printStackTrace();
			}
		}
	}

public class UserException {

	public static void main(String[] args) {
		voterAge ob=new voterAge();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=sc.nextInt();
		ob.CheckAge(age);

	}

}
