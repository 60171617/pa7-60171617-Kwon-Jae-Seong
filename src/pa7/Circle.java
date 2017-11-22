package pa7;

public class Circle extends Shape{
	
	double x;
	double y;
	double radius;
	double area;
	double length;
	
	public double getArea() { return area;}
	
	public double getLength() { return length;}
	
	public void draw() {
		System.out.println("Circle center"+ "("+ x+ ","+ y+")"+ "-"+ "radius"+"("+radius+")");
	}
	
	public Circle(double x, double y, double radius) {
		
		this.x=x;
		this.y=y;
		this.radius=radius;
		area = 3.14 * radius * radius;
		length = 2 * 3.14 * radius;
	}
}