package java20170603class;

//ctrl + shift + o to import at the same time when this class is moved to outside of the package

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2017/6/3 to study Member access control
		
		double area = 0;
		
		//Square1, public, type members and change data to public in Square1
		Square1 square1 = new Square1();
		square1.length = 10;
		square1.width = 9;		
		area = square1.getArea();
		System.out.println("area of square 1 =" + area);
		
		//Square2, default, change data to default in method Square2, by removing public from Square1
		Square2 square2 = new Square2();
		square2.length = 10;
		square2.width = 8;
		area = square2.getArea();
		System.out.println("area of square 2 =" + area);

		//Square3, protected, change data to default in method Square3, by changing public to protected in Square1
		Square3 square3 = new Square3();
		square3.length = 10;
		square3.width = 7;
		area = square3.getArea();
		System.out.println("area of square 3 =" + area);

		//Square4, private, copy Square1 and then use getter and setters to change private members visible
		Square4 square4 = new Square4();
		square4.setLength(10);
		square4.setWidth(6);		
		area = square4.getArea();
		System.out.println("area of square 4 =" + area);
		
	}

}
