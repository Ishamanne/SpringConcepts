package com.example.demo;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

@Component
public class StreamsEx {
	
	public static void main(String[] args) 
	{
//		 List<Integer> list = Arrays.asList(3, 4, 6, 12, 20); 
//		 boolean a = list.stream().anyMatch(n-> n%2 == 0);
//		 boolean b = list.stream().noneMatch(n-> n<0);
//		 System.out.println(b);
//		 List<String> lis = Arrays.asList("Data Structures", "JAVA", "OOPS", 
//                 "GeeksforGeeks", "Algorithms"); 
//		 lis.stream().mapToLong(str-> Long.bitCount(str.length())).forEach(System.out::println);
//		 Optional<Integer> i = list.stream().findAny();
//		 if(i.isPresent()) {
//			 System.out.println(i.get());
//		 }
		 Stream<String> s1= Stream.of("GFG", "Geeks",  
                 "for", "GeeksforGeeks"); 
		 
//		 s1.flatMap(s-> Stream.of(s.charAt(1))).forEachOrdered(System.out::println);
		 
//		 List<Integer> list = Arrays.asList(3, 4, 6, 12, 20); 
//		 list.stream().filter(n -> n%5==0).forEach(System.out::println);
		 
//		 long count = s1.collect(Collectors.counting());
//		 System.out.println(count);
//		 Stream<String> s2= Stream.of("GFG", "Geeks",  
//                 "for", "GeeksforGeeks"); 
//		 long c = s2.count();
//		 System.out.println(c);
		 
		 IntStream is = IntStream.range(1,5);
//		 is.skip(2).forEach(System.out::println);
//		 IntStream is2 = is.map(n->n*-n);
//		 is2.forEach(System.out::println);
//		   IntStream d = IntStream.of(6, 7, 8, 9); 
//		 IntStream s3 = is.flatMap(n -> IntStream.of(n*2));
//		 s3.forEach(System.out::println);
//		 OptionalInt an = d.findAny();
//		 boolean n1 = d.allMatch(n -> n%3==0);
		 List<String> k = Arrays.asList("1.5", "2.7", "3", 
                 "4", "5.6"); 
		 List<Integer> k1 = Arrays.asList(1,2,3,4); 
//		 k.stream().flatMapToDouble(n-> DoubleStream.of(Double.parseDouble(n))).forEach(System.out::println);
		 
//		 k1.stream().flatMapToInt(n-> IntStream.of(n)).forEach(System.out::println);
		 k1.isEmpty();
		  IntStream we = IntStream.of(2, 3, 3, 5, 6, 6, 8); 
//		  we.distinct().forEach(System.out::println);
//		 is.parallel().forEach(System.out::println);
		  DoubleStream ds= DoubleStream.of(10.2, 9.3, 8.4, 
                  7.5, 6.6); 
//		  OptionalDouble f = ds.average();
//		  double sum = ds.peek(System.out::println).sum();
		  DecimalFormat d = new DecimalFormat("$##.###");
		  d.applyPattern("##.###");
		  String s = d.format(123.4);
		  System.out.println(s); 
		  ds.flatMap(n -> DoubleStream.of(Double.parseDouble(d.format(n)))).forEach(System.out::println);
		  
		  
		  
	}

}
