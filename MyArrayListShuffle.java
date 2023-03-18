package gracy.com;
import java.util.ArrayList;
import java.util.Collections;
public class MyArrayListShuffle {

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
        Collections.shuffle(List);
        System.out.println("result after shuffle operation:");
        for(String str:List) {
            System.out.println(str);
        }
        Collections.shuffle(List);
        System.out.println("result after shuffle operation:");
        for(String str:List) {
            System.out.println(str);  
}
}
}