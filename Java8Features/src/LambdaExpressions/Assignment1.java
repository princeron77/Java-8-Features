package LambdaExpressions;

import java.util.ArrayList;

public class Assignment1 {

	public static void main(String args[]) {
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(2);
		list1.add(20);
		list1.add(3);
		list1.add(5);
		list1.add(8);
		list1.add(77);
		list1.add(54);
		list1.add(53);
		
		list1.forEach(n -> {
			if(n%2!=0)
				System.out.println(n);
		});
	}
}
