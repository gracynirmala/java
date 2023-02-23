package com.gracy;

import java.util.Scanner;
public class MovieMagic {
	int year;
	String title;
	float rating;
	MovieMagic(){
		year=0;
		title="";
		rating=0;
	}
	void Accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the movie name:  ");
		title=sc.nextLine();
		System.out.println("Enter the year of release of movie:");
		year=sc.nextInt();
		System.out.println("Enter the movie rating:");
		rating=sc.nextFloat();
	}
	void rating() {
	if(rating<=2.0) {
		System.out.println(title+":Movie is flop");
	}
	else if(rating>2.1&&rating<=3.4) {
		System.out.println(title+":Movie is semi-Hit");
	}
	else if(rating>3.5&&rating<=4.5) {
		System.out.println(title+":Movie is Hit");
	}
	else if(rating>4.6&&rating<=5.0) {
		System.out.println(title+":Movie is super Hit");
	}
		
	}

	public static void main(String[] args) {
		MovieMagic ob=new MovieMagic();
		ob.Accept();
		ob.rating();

	}

}
