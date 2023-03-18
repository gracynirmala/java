package gracy.com;
class A{
	int pnum;
	A(){
	System.out.println("Parent class:");
	pnum=10;
}
}
class B extends A{
	int cnum,sum;
	B(){
		System.out.println("child class:");
		cnum=9;
	}

void sum() {
	sum=pnum+cnum;
}
void display() {
	System.out.println("sum="+sum);
}

public class Inheritancepgm {

	public static void main(String[] args) {
		B ob=new B();
		ob.sum();
		ob.display();

	}

}
}
