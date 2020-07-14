package StringJoiner_Class;

import java.util.StringJoiner;

public class Assignment2 {

	public static void main(String args[]) {
		StringJoiner s1=new StringJoiner("-");
		StringJoiner s2=new StringJoiner("-");
		
		s1.add("prince");
		s2.add("Gola");
		s1.merge(s2);
		System.out.println(s1);
		s1.setEmptyValue("zero");
		System.out.println(s1);
		s2.merge(s1);
		System.out.println(s2);
	}
}
