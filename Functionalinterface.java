package gracy.com;
interface Addition{
	void add(int a , int b);
	
}
interface Subtraction{
	void sub(int a, int b);
}
interface Multiplication{
	void mult(int a, int b);
}

public class Functionalinterface {

	public static void main(String[] args) {

		//Annonymous class
		Addition aob= new Addition() {
			@Override
			public void add(int a, int b) {
				
				int s=a+b;
				System.out.println("sum="+s);
			}
		};
		aob.add(3, 5);
		
		//subtraction
		Subtraction sob=new Subtraction() {

			@Override
			public void sub(int a, int b) {
				int s=a-b;
				System.out.println("difference="+s);
				
			}
			
		};
		sob.sub(8, 2);
		
		Multiplication mob=new Multiplication() {
			
			@Override
			public void mult(int a, int b) {
				int p=a*b;
				System.out.println("Product="+p);
			}
		};
		mob.mult(2, 7);
	
	 }
}