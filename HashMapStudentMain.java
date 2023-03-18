package gracy.com;
import java.util.*;
public class HashMapStudentMain {

	public static void main (String args[]) {
		Map<Integer,String> students=new HashMap();
		students.put(111, "gracy");
		students.put(112, "Kaviya");
		students.put(113, "niveadha");
		students.put(114, "ezhil");
		students.put(115, "prissi");
		System.out.println(students);
		System.out.println("Phone\t\tName");
		for(Map.Entry<Integer,String>mapit:students.entrySet()) {
			System.out.println(mapit.getKey()+"\t"+mapit.getValue());
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student id");
		int sid=sc.nextInt();
		boolean b=students.containsKey(sid);
		if(b) {
			System.out.println("Student is exists");
			
		}else {
			System.out.println("Student not exists");
		}
		
	}

}