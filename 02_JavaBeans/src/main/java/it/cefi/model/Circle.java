package it.cefi.model;

public class Circle {

	private final double radius;

	public Circle(double radius) {
		if (radius <= 0) {
			throw new IllegalArgumentException("radius must be positive");
		}
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
	public double circumference() {
		return 2 * radius * Math.PI;
	}
	
	public double area() {
		return radius * radius * Math.PI;
	}
	
}
