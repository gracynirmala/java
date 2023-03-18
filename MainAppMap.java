package gracy.com;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class MainAppMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String>linkedhp=new LinkedHashMap<Integer,String>();
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			int pid=sc.nextInt();
			String pname=sc.next();
			linkedhp.put(pid,pname);
		}
		System.out.println(linkedhp);


	}

}
