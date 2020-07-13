package optionalClass;

import java.util.Optional;

public class Assignment2 {

	String address="myron656Meerut";
	String default_name="India";
	public static void main(String args[]) {
		Assignment2 a=new Assignment2();
		Optional<String> ol=Optional.ofNullable(a.address);
		System.out.println(ol.orElse(a.default_name));
	}
}
