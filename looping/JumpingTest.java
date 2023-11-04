package looping;

public class JumpingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * =================JUmping Statements=====================
		 * a> break; : exit from loop
		 * b>continue; :skip values
		 * c> return;  :exit from method
		 */
		for(int i=1; i<=10;i++) {
			if(i==5 || i==8) {
				//break;
				//continue;
				return;
			}
			System.out.println(i);
			
		}
		System.out.println("====end for loop===");

	}

}
