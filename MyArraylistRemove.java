package gracy.com;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class MyArraylistRemove {



	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(9);
		lst.add(87);
		lst.add(9);
		lst.add(87);
		lst.add(91);
		lst.add(10);

		System.out.println(lst);
		
		LinkedHashSet<Integer> lht=new LinkedHashSet<Integer>(lst);
		
		lst.clear();
		for(Integer it:lht) {
			lst.add(it);
		}

		System.out.println(lst);
      }
}


