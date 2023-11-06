package oops;
import java.util.Scanner;

public class Cube {
	int length;
	int breadth;
	int height;
	
	void getVolume() {
		int v=length*breadth*height;
		System.out.println("volume="+v);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Cube a=new Cube();
		System.out.println("enter a length");
		a.length=sc.nextInt();
		System.out.println("enter a breadth");
		a.breadth=sc.nextInt();
		System.out.println("enter a height");
		a.height=sc.nextInt();
		a.getVolume();
	}
	

}
