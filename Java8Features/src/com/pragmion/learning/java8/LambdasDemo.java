package com.pragmion.learning.java8;

import java.util.Arrays;
import java.util.List;

public class LambdasDemo {

	public static void main(String[] args) {
		
		final String seperator = " ";
		Arrays.asList("A", "B", "C").forEach((String e) -> {
			System.out.print(e+seperator);
		});
		
		System.out.println();
		List<String> li = Arrays.asList( "z", "f", "d" );
		li.sort( ( e1, e2 ) -> {
		    int result = e1.compareTo( e2 );
		    return result;
		} );
		System.out.print("Sort:");
		li.forEach(e -> System.out.print(e+seperator));
		
		
	}
}
