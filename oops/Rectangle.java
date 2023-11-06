package oops;

public class Rectangle {

	int length;
	int breadth;
	
	void getArea() {
		int area=length*breadth;
		System.out.println(area);
	}
	public static void main(String[] args) {
		Rectangle a=new Rectangle();
		a.length=4;
		a.breadth=5;
		a.getArea();
	}

}
