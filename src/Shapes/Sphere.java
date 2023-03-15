package Shapes;

public class Sphere {
	
	private double radius;
	
	public Sphere(double radius) {
		
		this.radius = radius;
	}
	
	public double getRadius(double radius) {
		return radius;
	}
	
	public void setRadius(double radius) {
		if(radius > 0) {
			this.radius = radius;
		}
	}
	
	public double calculateVolume() {
		return (4.0/3.0) * Math.PI * radius * radius * radius;
	}
	public String toString() {
		return "Radius of the sphere: " + radius;
	}
}