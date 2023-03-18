package com.gracy;

import com.gracy.pack1.Employee;

//default can be accessed with in pacakge
public class MainApp {

	public static void main(String[] args) {
		Product pob=new Product(1111, "TV"); //no error
		pob.display();
	  Employee eob=new Employee(1112, "Ravi");	//error
		eob.empDisplay();

	}

}