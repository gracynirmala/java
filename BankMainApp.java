package gracy.com;

import java .util.Scanner;

	class BankBalaceCheck extends Exception{
		public BankBalaceCheck(String s) {
			super(s);
		}
	}
	class Bank{
		float balance;
		public Bank() {
			balance=10000;
		}
		public void Withdraw(float wamount) {
			try {
				if(wamount>balance) {
					throw new BankBalaceCheck  ("Insufficient Balance");
					
				}
				else {
					balance=balance-wamount;
					System.out.println("Bank Balance after with Balance"+balance);
				}
			}
				catch( BankBalaceCheck e) {
					e.printStackTrace();
				}
			}
		}

	public class BankMainApp {

		public static void main(String[] args) {
			Bank ob=new Bank();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter amount to withdraw:");
			float wamt=sc.nextFloat();
			ob.Withdraw(wamt);

		}

	}

