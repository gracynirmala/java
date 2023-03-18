package gracy.com;
import java.util.*;
public class MethodRefStringMain {

	public static void main(String[] args) {
                List<String> list=Arrays.asList("spring","spring boot","API","Microservices","AWS","Azure","Docker");
				//to uppercase
				System.out.println("Upper Case:");
				list.stream()
				.map(x->x.toUpperCase())
				.forEach(System.out::println);
				//to lowercase
				System.out.println("Lower Case:");
				list.stream()
				.map(x->x.toLowerCase())
				.forEach(System.out::println);
				
				//to find length
				System.out.println("Lower:");
				list.stream()
				.map(x->x+":"+x.length())
				.forEach(System.out::println);
				
			}

		}
	


