package gracy.com;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.stream.Stream;

public class StreamString {

	public static void main(String[] args) {
		Stream<String>stream=Stream.of("hi hello");
		stream.forEach(System.out::println);
		
		Collection<String>collection=Arrays.asList("java","spring","hibernate");
		Stream<String>stream2=collection.stream();
		stream2.forEach(System.out::println);
		
		
		List<String>list=Arrays.asList("java","spring","hibernate");
		Stream<String>stream3=collection.stream();
		stream3.forEach(System.out::println);
		
		
		Set<String>set=new HashSet<>(list);
		Stream<String>stream4=collection.stream();
		stream4.forEach(System.out::println);
		
		
		String[]strArrays= {"a","b","c","d","e"};
		Stream<String>stream5=Arrays.stream(strArrays);
		stream5.forEach(System.out::println);
	}

}
