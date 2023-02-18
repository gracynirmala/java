package MenuProgram;
import java.util.Scanner;
class Bank{
	double deposite,widthdraw;
 double amount=100000;
 Scanner sc = new Scanner(System.in);
	public void Deposite() {
		System.out.println("Enter Deposite Amount : ");
		Scanner sc=new Scanner(System.in);
		deposite=sc.nextInt();
				amount=amount+deposite;
		System.out.println("Updated Balance = "+amount);
	}
	public void Widthdraw() {
		System.out.println("Enter Widthdrawal Amount : ");
		Scanner sc=new Scanner(System.in);
		widthdraw=sc.nextInt();
		if(amount>=widthdraw) {
		amount=amount-widthdraw;
		System.out.println("Updated Balance = "+amount);
		}
		else {
			System.out.println("Insufficient Balance");
			
		}
		
	}
	public void Display() {
		System.out.println("Account Balance = "+amount);
		
	}
	}
public class SwitchCaseMenuBank{

	
	public static void main(String[] args) {
		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("To Deposite Enter 1");
		System.out.println("To Widthdraw Enter 2");
		System.out.println("To Check Balance Enter 3");
		System.out.println("---------------------------------");
		System.out.println("Enter Your Choice:");
	     ch = sc.nextInt();
	    Bank ob=new Bank();
	    switch(ch){
	    case 1:
	    	ob.Deposite();
	    		    	break;
	    case 2:
	    	ob.Widthdraw();
	    	break;
	    case 3:
	    	ob.Display();
	    	break;
	        
	    	default:
	    		System.out.println("Enter the Correct Choice");
	    		break;
	        
	         	  
			 }

		}
}

	