package gracy.com;
import java.util.ArrayList;
import java.util.Collections;
public class MyArrayListSwap {


public static void main(String a[]){
        ArrayList<String> List = new ArrayList<String>();
        //adding elements to the end
        List.add("java");
        List.add("cric");
        List.add("play");
        List.add("Watch");
        List.add("Glass");
        List.add("movie");
        List.add("Girl");
        Collections.swap(List,2,5);
        System.out.println("result after swap operation:");
        for(String str:List) {
            System.out.println(str);
        }
}
}