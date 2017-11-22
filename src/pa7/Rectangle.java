package pa7;
//60171617 권재성
//이 프로그램은 각 도형의 넓이와 직사각형의 두 좌표와 밑변과 높이, 원의 중심과 반지름을 출력하는 프로그램입니다.


public class Rectangle extends Shape{
	
	double x;
	double y;
	double width;
	double height;
	double area;
	double length;
	double x2;
	double y2;
	
	public double getArea() { return area;}
	
	public double getLength() { return length; }
	
	public void draw() {
		double x2 = x + width;
		double y2 = y + height;
		System.out.println("Rectangle"+ "("+ x+ ","+ y+ ")"+ "-"+ "("+ x2 + ","+ y2 + ")");
		
	}
	
	public Rectangle(double x, double y, double width, double height) {
		
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		area = width * height;
		length = 2 * (width+height);
	}
}