package looping;
import java.util.Scanner;

public class ForTest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a string");
		String a=sc.nextLine();
		
		if(a.equals("hello world")) {
			for(int i=1;i<=100;i++) {
				System.out.println(a);
			}
		}
		else {
			System.out.println("invalid input");
		}

	}

}
