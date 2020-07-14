package parallelArraySorting;

import java.util.Arrays;

public class Assignment1 {

	public static void main(String args[]) {
		int arr[]=new int[] {1,5,4,8,81,20,34,69,74,27};
		Arrays.parallelSort(arr);
		int minSum=0;
		int maxSum=0;
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
