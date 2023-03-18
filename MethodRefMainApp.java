package gracy.com;
import java.util.List;


public class MethodRefMainApp {

	private static void print(int n) {
		System.out.println(n);
	}
	
	
	private static void printListFunctional(List<Integer> numbers) {
		//[6,1,3,9,23,89,44] //apple Lambda or method ref 
		//6
		//1
		//3
		//9
		//23
		//89
		//44
		
		numbers.stream()
		.forEach(MethodRefMainApp::print);
		
	}

	private static void printListElements(List<Integer> numbers) {
		for(int number:numbers) {
			System.out.println(numbers);
		}
		
	}
	
	public static void main(String[] args) {
		
		List<Integer> numbers=List.of(6,1,3,9,23,89,44);
		
		printListElements(numbers);
		printListFunctional( numbers);
		
    }

	

}