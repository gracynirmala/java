package gracy.com;
import java.lang.ArithmeticException;
public class MainApp2 {

	public static void main(String[] args) {
		int a=10,b=0,c=0;
		int ar[]=new int[5];
		System.out.println("Before operation");
		try {
			c=a/b;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
        try {
        	ar[6]=12;
        }catch(ArrayIndexOutOfBoundsException e) {
        	e.printStackTrace();
        }
        System.out.println("after opation");
        System.out.println("c="+c);
        System.out.println("ar[i]="+ar[3]);
	}

}
