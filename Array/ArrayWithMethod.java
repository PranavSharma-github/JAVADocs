package Array;

import java.util.Arrays;

public class ArrayWithMethod {

		/*
		 * ================== array with method=============
		 * a> array as an argument:
		 * 
		 *    void sum(int a,int b,int c,int d,int e...................5000th) 9
		 *    instead of this simply use
		 *    void sum(int a[]) {
		 *    }
		 *    
		 *    syntax:
		 *    return_type method_name(data_type array_name[]) {
		 *    
		 *    }
		 * 
		 * 
		 * 
		 * 
		 * b> array as return type:
		 * int[]  get10IntValue() {
		 * array=500,600,400,300,600
		 * 
		 *   return;
		 *   }
		 *   
		 *   syntax:
		 *     return_type[] mathod_name() {
		 *     
		 *     return array;
		 *     }
		 */
	public static void main(String[] args) {
		int data[]= {87,65,45,43,56};
		sum(data);
		int[] oddnums=getOddNumsFrom1to100();
		System.out.println(Arrays.toString(oddnums));
		
	}
		
		// array as arguments
		static void sum(int values[]) {
			int s=0;
			for(int x:values) {
				s=s+x;
			}
			System.out.println("total sum="+s);
			
		}
		//-------------array as return type---------------
		 static int[] getOddNumsFrom1to100() {
			 int oddnums[]=new int[50];
			 int j=0;
			 
			 for(int i=1;i<=100;i++) {
				 if(i%2!=0) {
					 oddnums[j]=i;
					 j++;
				 }
			 }
			 return oddnums;
		 }
		
		
	}

	


