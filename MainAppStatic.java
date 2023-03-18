package gracy.com;



class Employee{
	 int eid;
	 String ename;
	 static String cname;
	 static {  //static block used  to initialize static data
		 cname="EdubridegIndia Pvt.ltd";
	 }
	Employee(){
		System.out.println("Employee ");
	}
	 public Employee(int eid, String ename) {
		 this.eid=eid;
		 this.ename=ename;
		
	}
	void display() {
		System.out.println("Employee id="+eid);
		System.out.println("Employee Name="+ename);
		System.out.println("Employee company Name="+cname);
	}
}

public class MainAppStatic {

	public static void main(String[] args) {
		Employee eob1=new Employee(1111,"Gracy");
		Employee eob2=new Employee(1112,"Ezhil");
		Employee eob3=new Employee(1113,"Sandhiya");
	    eob1.display();
		eob2.display();
		eob3.display();
		
	}

}
		

