package Array;
import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		/*
		 * =================multidarray===========
		 * # used to store data in row and column form or in matrix form.
		 * 
		 * 
		 * 
		 * syntax:
		 *   data_type array_name[][]=new data_type[row][column];
		 */
		int mat[][]=new int[3][3];
		/*
		 *    C0 C1
		 * R0 50 60
		 * R1 30 70
		 * 
		 */
		// write data in array
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("enter value");
				mat[i][j]=sc.nextInt();
				
			}
			
		}
		//read data from array
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}

	}

}
