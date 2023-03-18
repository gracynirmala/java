package gracy.com;
class A1 {
		int a;
		A1(int j){
		a=j;
		System.out.println("This is a parent Class Costructor");
		//a=10;
		}
	}

	class B1 extends A1 {
		int b,sum;
		B1(int i, int j){
			super(j);
			System.out.println("This is a Child Class Costructor");
			b=i;
			//b=9;
		}
		void sum() {
			sum=a+b;
		}
		
		void display() {
			System.out.println("Sum= "+sum);
		}
		}


	public class Inheritancepgm1 {

		public static void main(String[] args) {
			B1 ob=new B1(10,20);
			ob.sum();
			ob.display();

		}

	}



		

	


