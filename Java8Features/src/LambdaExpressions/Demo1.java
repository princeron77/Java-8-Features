package LambdaExpressions;

/*Lambda expressions basically express instances of functional interfaces (An interface with single abstract method is called functional interface. An example is java.lang.Runnable). lambda expressions implement the only abstract function and therefore implement functional interfaces

lambda expressions are added in Java 8 and provide below functionalities.

Enable to treat functionality as a method argument, or code as data.
A function that can be created without belonging to any class.
A lambda expression can be passed around as if it was an object and executed on demand.*/

//Using Without Lambda Expressions

interface ron{
	int add(int x,int y);
}

//class A implements ron{
//	public int add(int x,int y) {
//		return x+y;
//	}
//}

public class Demo1 {
 //Commenting A class now Using Lambda expres.
	public static void main(String args[]) {
		//java 8 Lambda ( ->  )
		ron r=(x,y)->(x+y);
		
		int y=r.add(10, 20);
		System.out.println(y);
	}
}
