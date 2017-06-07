package java20170603class2;

public class ClientAppPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShapeProcessor sProcessor = new ShapeProcessor();
		
		Square square = new Square();
		sProcessor.draw(square);
		
		Rectangle rectangle = new Rectangle();
		sProcessor.draw(rectangle);
				
	}	
}
