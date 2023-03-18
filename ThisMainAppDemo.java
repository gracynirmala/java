package gracy.com;
class Product{
	int pid;
	String pname;
	Product(int pid, String pname){ //pid=1111  pname="Samsung TV
		this(pid);
		System.out.println("Two argument constructor");
		this.pname=pname;
	}
	Product(int pid){
		this.pid=pid;
		System.out.println("One argument constructor");
	}
	
	void display() {
		System.out.println("Product id="+pid);
		System.out.println("Product name="+pname);
	}
}

public class ThisMainAppDemo {

	
	public static void main(String[] args) {
		Product pob=new Product(1111,"Samsung TV"); //calls two argument constructor
            pob.display();
	}

}



		

	


