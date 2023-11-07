 package Array;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		int age[]=new int[5];
		/*
		 * 0 1 2 3 4
		 * [][][][][]
		 * <---age--->
		 */
		// write data in array
		//age[0]=20;
		//age[1]=18;
		//age[2]=26;
		//age[3]=20;
		//age[4]=30;
		
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<age.length;i++) {
			
			System.out.println("enter your age");
			age[i]=sc.nextInt(); }
		
		// read data from array
		for(int x:age) {
			System.out.println(x);
			
		}
		
		
		

	}

}
