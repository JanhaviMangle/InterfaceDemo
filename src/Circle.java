
public class Circle implements Shape {
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	private double radius;

	@Override
	public void draw() {
		System.out.println("drawing circle");

	}

	@Override
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
      
	public double getRadius() {
		return this.radius;
	}
}
