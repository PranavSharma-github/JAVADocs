package Array;

import java.util.Arrays;

public class ArrayWithMethodJava2 {
	public static void main(String[] args) {
		int[] evennums=getEvenNumsFrom1to100();
		System.out.println(Arrays.toString(evennums));
		
	}
	 static int[] getEvenNumsFrom1to100() {
		 int evennums[]=new int[50];
		 int j=0;
		 
		 for(int i=1;i<=100;i++) {
			 if(i%2==0) {
				 evennums[j]=i;
				 j++;
			 }
		 }
		 return evennums;
	 }
	

}
