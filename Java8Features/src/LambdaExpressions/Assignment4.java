package LambdaExpressions;

interface wordCount{
	String count(String str);
}

public class Assignment4 {

	public static void main(String args[]) {
		wordCount w=(str) -> (str);
		
		String str1=w.count("Princeron");
		System.out.println(str1.length());
	}
}
