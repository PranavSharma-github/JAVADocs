package controlstm.selection;
import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter a length");
		int length=sc.nextInt();
		
		System.out.println("enter a breadth");
		int breadth=sc.nextInt();
		
		if(length>breadth) {
			int area=length*breadth;
			System.out.println("the area="+area);
		}
		else {
			System.out.println("no area");
		}

	}

}
