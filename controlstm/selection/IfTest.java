
package controlstm.selection;
import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * =================if===================
		 * # used to implement single condition
		 * 
		 * syntax:
		 *     if(condition) {
		 *        // statements
		 *    }    
		 */
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter salary in rupees");
		int salary=sc.nextInt();
		
		
		if(salary>30000) {
		salary=salary+5000;
		}
		System.out.println("total salary="+salary);

	}

}
