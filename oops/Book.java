package oops;

public class Book {
	// properties
	int id;
	String name;
	String author;
	int price;
	
	// methods
	void printBookInfo() {
		System.out.println("Id="+id);
		System.out.println("Name="+name);
		System.out.println("Author="+author);
		System.out.println("Price="+price);
	}
	public static void main(String[] args) {
		// represent English books in java
		
		Book b1=new Book();
		b1.id=565656;
		b1.name="english";
		b1.author="JK ROWLING";
		b1.price=300;
		b1.printBookInfo();
		
		// represent computer books in java.
		
		Book b2=new Book();
		b2.id=6666;
		b2.name="pranav";
		b2.author="sir";
		b2.price=600;
		b2.printBookInfo();
				
		
	}
	
	 

}
