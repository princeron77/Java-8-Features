package streamAPI.Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String args[]) {
		List<Employee> li=new ArrayList<>();
		li.add(new Employee(1,"Prince",22,"Meerut"));
		li.add(new Employee(2,"Aman",25,"Pune"));
		li.add(new Employee(3,"Prince22",30,"Modinagar"));
		li.add(new Employee(4,"Prince11",10,"pune"));
		
		List<Employee> li1=li.stream().filter(emp -> emp.location == "pune").collect(Collectors.toList());
		for(Employee emp:li1) {
			System.out.println(emp.name);
		}
	}
}
