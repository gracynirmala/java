package gracy.com;



class MultiplicationTable{
	
synchronized public void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+"x"+i+"="+n*i);
		}
	}
}

class MyClass2 extends Thread{
	MultiplicationTable t2;
	 public MyClass2(MultiplicationTable mtob) {
		this.t2=mtob;
	}

	public void run() {
		t2.printTable(5);
		}

	}
class MyClass1 extends Thread{
	MultiplicationTable t1;
 public MyClass1(MultiplicationTable mtob) {
		this.t1=mtob;
	}

public void run() {
	t1.printTable(2);
	}

}

public class MainApp {
	
	public static void main(String[] args) throws InterruptedException {
		MultiplicationTable mtob=new MultiplicationTable();
		MyClass1 ob1=new MyClass1(mtob);
		MyClass2 ob2=new MyClass2(mtob);
		ob1.start();
		//ob1.join();
		ob2.start();
		
	}

}