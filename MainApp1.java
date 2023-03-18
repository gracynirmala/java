package gracy.com;
interface productIntf{
	void meth1();
	default void meth2() {
		System.out.println("default method java 8 feature");
	}
	public static void  stameth() {
		System.out.println("static method");
	}
	
}

public class MainApp1 implements productIntf{
public void meth1() {
		System.out.println("mProductInterfmethod1");
		
	}
public static void main(String []arg) {
	product pob=new product();
	pob.m1();
	pob.m2();
	productIntf.stameth();
}

}
