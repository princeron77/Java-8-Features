package parallelArraySorting;

import java.util.Arrays;

public class Assignment3 {

	public static void main(String args[]) {
		int arr[]=new int[] {21,41,1,5,98,8,63,24,27,15,1,4};
		
		Arrays.parallelSort(arr,0,5);
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
