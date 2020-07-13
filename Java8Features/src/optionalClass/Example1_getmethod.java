package optionalClass;

import java.util.Optional;

public class Example1_getmethod {

	String name; // returns error with no null chcek
	//String name="Prince"; //return value by using get of optional instance
	public static void main(String args[]) {
		Example1_getmethod obj1=new Example1_getmethod();
		Optional<String> ol=Optional.ofNullable(obj1.name);
		System.out.println(ol.get());
	}
}
