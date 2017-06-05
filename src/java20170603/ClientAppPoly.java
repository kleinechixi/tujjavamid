package java20170603;


public class ClientAppPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeProcessor sProcessor = new ShapeProcessor();
		
		//Overriding: the same method with different parameters 
		//Inheritance: extend Square and Rectangle to Shape 
		Square square = new Square();
		sProcessor.draw(square);

		Rectangle rectangle = new Rectangle();
		sProcessor.draw(rectangle);

	}

}
