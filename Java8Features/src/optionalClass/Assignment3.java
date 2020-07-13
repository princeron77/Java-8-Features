package optionalClass;

//import java.io.InvalidClassException;
import java.util.Optional;

public class Assignment3 {

	String empName;
	public static void main(String args[]) throws Exception {
		Assignment3 a=new Assignment3();
		Optional<String> op=Optional.ofNullable(a.empName);
		System.out.println(op.orElseThrow( ()-> new Exception("InvalidEmployeeException")));
	}
}
