class Rectangle {
	int length;
	int breadth;
	
	//constructor
	Rectangle(int l, int b) {
		length = l;
		breadth = b;
	}
	
	//copy constructor
	Rectangle(Rectangle obj) {
		length = obj.length;
		breadth = obj.breadth;
	}
	
	int area() {
		return length*breadth;
	}
}

public class CopyConstructorExample {
	public static void main(String[] args) {
		Rectangle firstRect = new Rectangle(5, 6);
		Rectangle secondRect = new Rectangle(firstRect);
		
		System.out.println("Area of First Rectangle : " + firstRect.area());
		System.out.println("Area of Second Rectangle : " + secondRect.area());
	}
}
