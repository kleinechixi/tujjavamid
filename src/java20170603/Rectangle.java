package java20170603;

public class Rectangle extends Shape {
	
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
			System.out.println("drawing Rectangle ...");
		}
}
