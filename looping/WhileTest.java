package looping;

public class WhileTest {

	public static void main(String[] args) {
		/*
		 * syntax:
		 *   while(condition) {
		 *     //statements
		 *     }
		 *
		 */

int n=5;
int fact=1;

while(n>1) {
	fact=fact*n;
	n--;
}

System.out.println(fact);
	}
}
