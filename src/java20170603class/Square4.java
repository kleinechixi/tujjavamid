package java20170603class;

//how to use getter and setter to protect field ,
//field is private to protect, method is public to available
public class Square4 {
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
		

}
