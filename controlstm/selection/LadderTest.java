package controlstm.selection;

public class LadderTest {

	public static void main(String[] args) {
		/*
		 *  syntax:
		 *  if(condition-1) {
		 *  {
		 *  else if(condition-2) {
		 *  }
		 *  else if(condition-3) {
		 *  }
		 *  ..............
		 *  ............
		 *  else{
		 *  }
		 */
		int marks=89;
		if(marks>=80) {
			System.out.println("distinction");
		}
		else if(marks>=60) {
			System.out.println("first");
		}
		else if(marks>=45) {
			System.out.println("second");
		}
		else if(marks>=32) {
			System.out.println("third");
		}
		else {
			System.out.println("failed");
		}

	}

}
