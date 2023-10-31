package controlstm.selection;

public class NestedTest {

/*
 *  syntax:
 *    if(condition-1) {
 *      if(condition-2) {
 *      ......................
 *      ....................
 *      } else{
 *      }
 *      } else{
 *      }
 */
	public static void main(String[] args) {
		String citizen="nepali";
		int age=30;
		if(citizen.equals("nepali")) {
			if(age>=18) {
				System.out.println("you  are eligble for voting");
			} else {
				System.out.println("you are not eligible");
			} 	
		
	}
		else {
			System.out.println("invalid citizenship");
		}
}
}

