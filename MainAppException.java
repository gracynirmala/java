package gracy.com;

public class MainAppException {

	public static void main(String[] args) {
		int a=10,b=0,c=0;
		System.out.println("Before division");
		try {
			c=a/b;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("c="+c);
		System.out.println("Before division");

	}

}
