package Threadpgm;
class myclass1 implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
	System.out.println("Run method"+Thread.currentThread());
	try {
		System.out.println("inside sleep methode");
		Thread.sleep(5000);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
	}
}

public class MainAppRunnable {

	public static void main(String[] args) throws InterruptedException {
	myclass1 ob1=new myclass1();
	Thread tob1=new Thread(ob1);
	myclass1 ob2=new myclass1();
	Thread tob2=new Thread(ob1);
	tob1.setName("First");
	tob2.setName("second");
    
	tob1.start();
    tob1.join();
    tob2.start();
	}

}


