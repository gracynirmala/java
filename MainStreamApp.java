package gracy.com;

import java.util.List;

public class MainStreamApp {
	private static void printfunctioalprogmethodref(List<Integer>elements) {
		elements.stream()
		.forEach(System.out::println);
	}
	private static void printEvenNumber(List<Integer>elements) {
		System.out.println("Even numbers");
		elements.stream()
		.filter(x->x%2==0)
		.forEach(System.out::println);
	}
	private static void printOddNumber(List<Integer>elements) {
		System.out.println("Odd numbers");
		elements.stream()
		.filter(x->x%2==1)
		.forEach(System.out::println);
	}
	private static void printGreater10(List<Integer>elements) {
		System.out.println("values greater than 10 ");
		elements.stream()
		.filter(x->x>10)
		.forEach(System.out::println);
	}
	private static void printSquareNumber(List<Integer>elements) {
		System.out.println("Square of all array list number ");
		elements.stream()
		.map(x->x*x)
		.forEach(System.out::println);
	}
	private static void printCubeNumber(List<Integer>elements) {
		System.out.println("Cube of all array list number ");
		elements.stream()
		.map(x->x*x*x)
		.forEach(System.out::println);
	}
	public static void main(String[] args ) {
        List<Integer>elements=List.of(4,3,21,8,98,43) ;
        printfunctioalprogmethodref(elements);
        printEvenNumber(elements);
        printGreater10(elements);
        printOddNumber(elements);
        printSquareNumber(elements);
        printCubeNumber(elements);
	}

}
