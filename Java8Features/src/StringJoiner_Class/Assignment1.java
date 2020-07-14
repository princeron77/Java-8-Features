package StringJoiner_Class;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Assignment1 {

	public static void main(String args[]) {
		StringJoiner s1=new StringJoiner(",","{","}");
		List<String> li=new ArrayList<>();
		li.add("Aman");
		li.add("Prince");
		li.add("ron");
		li.add("Gola");
		
		li.forEach(s -> s1.add(s));
		System.out.println(s1);
	}
}
