package prob6;

public class Rectangle extends Shape implements Resizable {
	
	private double width;
	private double height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void resize(double s) {
		width = width * s;
		height = height * s;
		
	}

	@Override
	double getArea() {
		return width * height;
		
	}

	@Override
	double getPerimeter() {
		return (width + height) *2;
		
	}

	
}
