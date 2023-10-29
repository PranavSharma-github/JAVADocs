package DataType;
import java.util.Scanner;

public class VariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* # use to store value/data in the program
		 * # value stored for data processing
		 * 
		 *  syntax:
		 *   data_type variable_name;
		 * 
		 */
		// ADD 500 AND 800
		int a;
		int b;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter value of a");
		a=sc.nextInt();
		
		System.out.println("enter vaue of b");
		b=sc.nextInt();
		
		int c=a+b;
		System.out.println("the sum="+c);

	}

}
