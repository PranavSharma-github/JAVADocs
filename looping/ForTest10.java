package looping;
import java.util.Scanner;

public class ForTest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number");
		int a=sc.nextInt();
		
		if(a>1 && a<=100) {
			for(int i=1;i<=50;i++) {
				System.out.println("my name is pranav");
			}
		}
		else {
			System.out.println("invalid input");
		}

	}

}
