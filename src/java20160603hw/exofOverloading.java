package java20160603hw;

//20170603 hw2 q3 
//overloading: in the same class, using the same method, but given different arguments.
//ref.https://www.javadrive.jp/start/method/index8.html

public class exofOverloading {

	public static void main(String[] args) {

		//Overloading ex.1 int + int
		System.out.println(plus(10, 1));
		//Overloading ex.2 double + int
		System.out.println(plus(3.2, 4));
		//Overloading ex.3 int + double
		System.out.println(plus(7, 1.223));
		//Overloading ex.4 double + double
		System.out.println(plus(5.08, 2.4));		
	}

	//Overloading ex.1 int + int
	private static int plus(int n1, int n2) {
		System.out.println("plus(10, 1)");
		return n1 + n2;
	}

	//Overloading ex.2 double + int
	private static double plus(double n3, int n4) {
		System.out.println("plus(3.2, 4)");
		return n3 + n4;
	}

	//Overloading ex.3 int + double
	private static double plus(int n5, double n6) {
		System.out.println("plus(7, 1.223)");
		return n5 + n6;
	}

	//Overloading ex.4 double + double	
	private static double plus(double n7, double n8) {
		System.out.println("plus(5.08, 2.4)");		
		return n7 + n8;
	}

	
}
