package Method;

public class MethodTest {

	public static void main(String[] args) {
		sum();
		area();
		printTable(10);
		int x=getSumof1to100();
		System.out.println(x);
		int v=findSmallestValue(3,4);
		System.out.println(v);
	}
		//1. no return type with no arguments.
		static void sum() {
			int a=6;
			int b=8;
			
			int s=a+b;
			System.out.println("the sum="+s);
			
		}
		static void area() {
			int l=5;
			int b=6;
			int a=l*b;
			System.out.println("the area="+a);
		}
		
		//2. no return type with arguments
		
		static void printTable(int n) {
			
			for(int i=1;i<=10;i++) {
				System.out.println(n+"x"+i+"="+(n*i));
			}
		}
			
		//3. return type with no arguments	
			static int getSumof1to100() {
				int s=0;
				for(int i=1;i<=100;i++) {
					s=s+i;
				}
				return s;
			
		}
		//4. return type with arguments.
			static int findSmallestValue(int a,int b) {
				if(a>b) {
					return a;
				}
				else {
					return b;
				}
			}


	}


