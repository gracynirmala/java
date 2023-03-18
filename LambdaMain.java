package gracy.com;

interface Addition01{
	int add(int a,int b);
}
interface Subtraction01{
	int sub(int a,int b);
	}
interface Multiplication01{
	int mul(int a,int b);
}
interface runnable{
	public static final int i = 0;
}
public class LambdaMain {
	public static void main(String[] args) {
		
		//Addition subtraction and multiplication
		
		Addition01 aob=(a,b)->a+b;
		System.out.println("sum ="+aob.add(7, 8));
		
		Subtraction01 sob=(a,b)->a-b;
		System.out.println("Difference ="+sob.sub(15, 3));
		
		Multiplication01 mob=(a,b)->a*b;
		System.out.println("Product ="+mob.mul(4, 6));
		
		//implementing Runnable interface using lambda
		Runnable rob=()->{

            System.out.println("runnable method");           
		    for(int i=1;i<=10;i++) 
			System.out.println(i);	
			};
			Thread tob =new Thread(rob);
			tob.start();
		}
	}

	


	


