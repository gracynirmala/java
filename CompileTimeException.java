package gracy.com;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompileTimeException {

	public static void main(String[] args )throws IOException {
		String name;
		int age;
		float salary;
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
        System.out.println("Enter name:");
        name=br.readLine();
        System.out.println("Enter Age:");
        age=Integer.parseInt(br.readLine());
        System.out.println("Enter salary:");
        salary=Float.parseFloat(br.readLine());
        
        
        System.out.println("Name="+name);
        System.out.println("age="+age);
        System.out.println("salary="+salary);
        }
	

}
