package methodReference;

@FunctionalInterface
interface ron{
	void display();
}
public class MethodRef_ToInstanceMethod {

	public void myMethod() {
		System.out.println("Instance Method");
	}
	public static void main(String args[]) {
		MethodRef_ToInstanceMethod mf=new MethodRef_ToInstanceMethod();
		
		ron r=mf::myMethod; //referencing method ref. with instance of method to call interface
		
		r.display();	
	}
}
