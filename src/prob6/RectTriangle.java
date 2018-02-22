package prob6;

public class RectTriangle extends Shape{

	private double width;
	private double height;

	public RectTriangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	double getArea() {
		
		return width * height * 1/2;
	}

	@Override
	double getPerimeter() {
		
		return width + height + Math.sqrt((width*width)+(height*height));
		
	}
	
	
}
