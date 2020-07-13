package optionalClass;

import java.util.Optional;

public class Assignment1 {

	String names[ ]=new String[0];
	public static void main(String args[]) {
		Assignment1 a=new Assignment1();
		Optional<String[]> ol=Optional.ofNullable(a.names);
		if( ol.isPresent()){
			System.out.println(ol.get().toString());
		}
		else {
			System.out.print("no values");
		}
	}
}
