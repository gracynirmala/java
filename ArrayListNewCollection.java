package gracy.com;

import java.util.ArrayList;
import java.util.List;
public class ArrayListNewCollection {


    public static void main(String a[]){
        ArrayList<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual ArrayList:"+arrl);
        List<String>List=new ArrayList<String>();
        List.add("one");
        List.add("two");
        arrl.addAll(List);
            System.out.println("After copy:"+arrl);
        }
}