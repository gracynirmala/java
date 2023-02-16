package Employee;

import java.util.Scanner;
class Employee{
	//variable declared in the class are called instance variables
	String ename; //to store name use String class
    int eid;
    float esalary;
    
    void inputData() {
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee name");
        ename=sc.nextLine(); //next() to read string( one word)
                             //nextLine() to read more than one word
        System.out.println("Enter employee id");
        eid=sc.nextInt();
        System.out.println("Enter employee salary");
        esalary=sc.nextFloat();
    }
    
    void display() {
    	 System.out.println("Employee Details");
         System.out.println("Employee Name="+ename);
         System.out.println("Employee id="+eid);
         System.out.println("Employee Salary="+esalary);
    }
}

public class EmployeeInfoMain1 {

	public static void main(String[] args) {
		
        System.out.println("Main method ");
        
        Employee eob=new Employee();
        eob.inputData();
        eob.display();
       
	}
}
