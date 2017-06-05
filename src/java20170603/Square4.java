package java20170603;

public class Square4 {

	//eclipse -> source -> generate getters and setters, automatically formulated below;
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	//eclipse -> source -> generate getters and setters, automatically formulated above;
	
	private double length;
	private double width;

	//private
	public double getArea(){
		double area;
		area = length * width;
		return area;
		
		
		
		
	}
}
