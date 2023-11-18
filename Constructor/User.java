package Constructor;

public class User {
	// instance variable
	String username;
	String password;
	
	//==================== default constructor================
	User() {
		username="test";
		password="123";
	}
	
	//================= parameterized constructor============
	User(String username, String password) {
		this.username=username; // if username is set to username and password is set to password then the result shows "null".
		this.password=password; // calling instance varibales
		// this.printuser() calling instance method
		// this(); calls default constructor
		// this("aaa","ddff"); // calling constructor
		
		/*
		 * 'this' keyword represents current object 
		 * using 'this' keyword we can call instance varibales
		 */
	}
	User(String password) {
		this.password=password;
	}
	
	//instance method
	void printuser() {
		System.out.println("username="+username);
		System.out.println("Password="+password);
	}
	public static void main(String[] args) {
		User u=new User("hari","4455");
		u.printuser();
		
		User u1=new User();
		new User("pppp").printuser();
	}

}
