package gracy.com;
import java.util.ArrayList;
import java.util.Collections;
public class MyArrayListReverse {
public static void main(String a[]){
        ArrayList<String> List = new ArrayList<String>();
        //adding elements to the end
        List.add("java");
        List.add("cric");
        List.add("play");
        List.add("Watch");
        List.add("Glass");
        Collections.reverse(List);
        System.out.println("result after reverse operation:");
        for(String str:List) {
            System.out.println(str);
        }
}
}