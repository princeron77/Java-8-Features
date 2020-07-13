package forEach_Examples;

import java.util.*;

public class Assignment1 {

	public static void main(String args[]) {
		
		List<String> li=new ArrayList<>();
		li.add("Sunday");
		li.add("Monday");
		li.add("Tiesday");
		li.add("Wednesday");
		li.add("Thursday");
		li.add("Friday");
		li.add("Saturday");
		
		li.forEach(n -> {
			System.out.println(n);
		});
	}
}
