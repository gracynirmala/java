package Threadpgm;
class myclass extends Thread{
	public void run() {
		for(int i=1;i<=5;i++)
		System.out.println("Run method is called"+Thread.currentThread());
	}
}

public class ThreadMain {

	public static void main(String[] args) {
		System.out.println("JVM Thread"+Thread.currentThread());
		myclass ob=new myclass();
		myclass ob1=new myclass();
		ob.setName("firstthread");
		ob1.setName("secondthread");
		ob.start();
		ob1.start();

	}

}
