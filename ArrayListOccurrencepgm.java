package gracy.com;
import java.util.*;
public class ArrayListOccurrencepgm {
	public static void main(String arg[]) {
	ArrayList<Integer>list=new ArrayList();
	list.add(5);
	list.add(6);
	list.add(4);
	list.add(5);
	list.add(1);
	list.add(2);
	list.add(5);
	int count=0;
	int a=5;
	for(int b:list) {
		
		if(a==0)
			count++;
	}
	if(count>0)
		System.out.println("5 is present"+count+"times in the list");
	else
		System.out.println("5 is present in the list");
}
}
