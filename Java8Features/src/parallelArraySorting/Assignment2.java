package parallelArraySorting;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String args[]) {
		Scanner z=new Scanner(System.in);
		String str=z.nextLine();
		char[] ch=str.toCharArray();
		Arrays.parallelSort(ch);
		String str1=String.valueOf(ch);
		System.out.println(str1);
	}
}
