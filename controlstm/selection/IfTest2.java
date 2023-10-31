package controlstm.selection;
import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a principle");
		int P=sc.nextInt();
		
		System.out.println("enter a time");
		int T=sc.nextInt();
		
		System.out.println("enter a rate");
		int R=sc.nextInt();
		
		if(P!=0 && T!=0 && R!=0) {
			int SI=(P*T*R)/100;
		System.out.println("the simple interest="+SI);
		}
	}

}
