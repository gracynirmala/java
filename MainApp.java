package gracy.com;
interface f1{
	void m1();
}
interface f2{
	void m2();
}
interface f3 extends f1,f2{
	void m3();
}
class product implements f3{
	public void m1(){
		System.out.println(" m1 method ");
	}
	public void m2(){
		System.out.println(" m2 method ");
}
	
	public void m3(){
		System.out.println(" m3 method ");
}
}
	
public class MainApp {

	public static void main(String[] args) {
		product pob=new product();
		pob.m1();
		pob.m2();
		pob.m3();

	}

}
