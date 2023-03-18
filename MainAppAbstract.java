package gracy.com;

abstract class Shape{
	abstract void area();

		
	}

class Square extends Shape{

	@Override
	void area() {
		System.out.println("square area");
		
	}

}

public class MainAppAbstract {

	public static void main(String[] args) {
		//Shape ob=new Shape();//error because of abstract
		Square sob=new Square();
		sob.area();
		}
}