package gracy.com;


	class Bank{
		double balance;
		Bank(){
			balance=1000;
		}
		synchronized void deposit(double damt) {
			System.out.println("You are in deposit");
			balance=balance+damt;
			notify(); //method of Object class 
			
		}
		
		synchronized void withdraw(double wamt) throws InterruptedException {
			System.out.println("You are in withdraw");
			if(balance<wamt) {
				wait();//method of Object class 
			}
		
				balance=balance-wamt;
					
				System.out.println("You can withdraw");
				
			}
		}


	public class BankMainApp {

		public static void main(String[] args) {
			Bank bob=new Bank();
			new Thread() {
				public void run() {
					try {
						bob.withdraw(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}.start();

			new Thread() {
				public void run() {
					bob.deposit(2000);
				}
			}.start();
		}
	}

		

	
