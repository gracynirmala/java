package gracy.com;

import java.util.ArrayList;

public class ArraylistDemo {

	public static void main(String[] args) {
		ArrayList<Integer>lobj=new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			lobj.add(i);
		}
         lobj.add(100);
         lobj.add(4,78);
         System.out.println(lobj);
         lobj.remove(4);
         System.out.println(lobj);
         System.out.println("Size of Arraylist"+lobj.size());
         System.out.println("Check 78 present or not in a list"+lobj.contains(lobj));
	}

}
