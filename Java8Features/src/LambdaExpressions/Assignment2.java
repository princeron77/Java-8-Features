package LambdaExpressions;

import java.util.ArrayList;

public class Assignment2 {

	public static void main(String args[]) {
		
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Aman");
		ar.add("Prince");
		ar.add("Gola");
		ar.add("Ron");
		
		
		ar.forEach(n -> {
			String s1="";
			for(int i=n.length()-1;i>=0;i--) {
				s1=s1+n.charAt(i);
				n=s1;
				}
			System.out.println(n.length());

		});
	}
}
