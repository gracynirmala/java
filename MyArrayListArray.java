package gracy.com;
import java.util.ArrayList;
public class MyArrayListArray {

	public static void main(String a[]){
        ArrayList<String> arrl = new ArrayList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual ArrayList:"+arrl);
        String[] strArr = new String[arrl.size()];
        arrl.toArray(strArr);
        System.out.println("Created Array content:");
        for(String str:strArr){
            System.out.println(str);
        }
        
        
        ArrayList<Integer>l1=new ArrayList<Integer>();
        l1.add(9);//Integer
        l1.add(8);
       Integer ar[]=new Integer[l1.size()];
        l1.toArray(ar);
        int s=0;
        for(int i=0;i<ar.length;i++) {
        	s=s+ar[i];
        }
    }
}