package com.gracy;

public class Product {
 int productid;  //default
 String productname; //default
 Product(int productid, String productname){  //default
	 this.productid=productid;
	 this.productname=productname;
 }
 
 void display() {
	 System.out.println("Product id="+productid);
	 System.out.println("Product name="+productname);
 }
}
