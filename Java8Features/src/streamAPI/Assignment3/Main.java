package streamAPI.Assignment3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String args[]) {
		List<Student> li=new ArrayList<>();
		
		li.add(new Student(10,"Prince",56));
		li.add(new Student(11,"sdfs",40));
		li.add(new Student(12,"Prisfsfsnce",68));
		li.add(new Student(13,"sfsfc",50));
		li.add(new Student(14,"aman",59));
		
		Long li1=li.stream().filter(st -> st.marks>=50).count();
		System.out.println(li1);
		
	}
}
