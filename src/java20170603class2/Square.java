package java20170603class2;

public class Square {

	private double length;
	private double width;
	
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
	
	public double getArea(){
		double area;
		area = length * width;
		return area;	
	}
	
	public void draw(){
		System.out.println("drawing square..");
	}
	
	
	
}
