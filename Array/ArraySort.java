package Array;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int array[]= {9,67,66,5,5,4,3,3,32,3,345,5,6,6,6,54,53};
Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
		
		System.out.println("======reverse order=====");
		for(int i=array.length-1;i>0;i--) {
			System.out.println(array[i]+" ");
		}

	}

}
