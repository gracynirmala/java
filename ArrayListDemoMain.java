package gracy.com;
	import java.util.*;
	public class ArrayListDemoMain  {
		public static void main (String args[]) {
			ArrayList<Integer> ob1=new ArrayList<Integer>();
			ob1.add(56);
			ob1.add(6);
			ob1.add(856);
			ob1.add(586);
			ob1.add(52);
			ob1.add(66);
			System.out.println(ob1);
			
			ArrayList<String> ob2=new ArrayList<>();
			ob2.add("Misbha");
			ob2.add("janani");
			ob2.add("roshni");
			ob2.add("divagar");
			ob2.add("mohan");
			ob2.add("ramya");
			System.out.println(ob2);
			
			ArrayList<Float> ob3=new ArrayList<>();
			ob3.add(56.4f);
			ob3.add(6.3f);
			ob3.add(856.7f);
			ob3.add(586f);
			ob3.add(52f);
			ob3.add(66f);

	        Iterator<Float> ob=ob3.iterator();
	        while(ob.hasNext()) {
	        	System.out.println(ob.next());
	        }
			
		}
	}


