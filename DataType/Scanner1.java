package DataType;
import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your  address");
		String address=sc.nextLine();
		System.out.println(address);
		
		System.out.println("enter your name");
		String name=sc.nextLine();
		System.out.println("the name="+name);
		
		System.out.println("enter your age ");
		int age=sc.nextInt();
		System.out.println("my age="+age);

	}

}
