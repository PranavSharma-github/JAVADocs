package looping;

public class EnhanceForTest {

	public static void main(String[] args) {
		/*
		 * ==================Enhance For Loop========================
		 * # use to read data from collection(array,list,set,map...)
		 * 
		 * syntax;
		 * 
		 * for(data_type var: collection) {
		 * 
		 *   //statements
		 *   }
		 */
		int values[]= {9,78,87,98,99,89,83,96,73};
		int s=0;
		for(int x:values) {
			System.out.println(x);
			s=s+x;
		}
System.out.println("total sum="+s);
	}

}
