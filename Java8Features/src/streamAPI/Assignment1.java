package streamAPI;
import java.util.*;
import java.util.stream.Collectors;

public class Assignment1 {

	public static void main(String args[]) {
		List<Integer> li=new ArrayList<>();
		li.add(1);
		li.add(5);
		li.add(10);
		li.add(51);
		li.add(34);
		li.add(84);
		
		List<Integer> li1=li.stream()
				.filter(x -> x%2==0)
					.collect(Collectors.toList());
		
		System.out.println(li1);
	}
}
