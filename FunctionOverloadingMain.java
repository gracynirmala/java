package gracy.com;
class parent{
	void display() {
		System.out.println("Display method of parent");
		}
}
class child extends parent{
	void display() {
		super.display();
		System.out.println("Display method  of child");
	}
}
public class FunctionOverloadingMain {

	public static void main(String[] args) {
		 child cob=new child();
		cob.display();

	}

}
