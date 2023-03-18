package gracy.com;
import java.util.ArrayList;
import java.util.List;
public class MyElementCheck {


    public static void main(String a[]){
        ArrayList<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual ArrayList:"+arrl);
        List<String>List=new ArrayList<String>();
        List.add("second");
        List.add("Random");
            System.out.println("Arraylist containt all list elements?:"+arrl.containsAll(List));
            List.add("one");
            System.out.println("Arraylist containt all list elements?:"+arrl.containsAll(List));
        }
}
