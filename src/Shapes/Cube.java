package Shapes;

public class Cube {
	
	private double side;
	
	public Cube(double side) {
		
		this.side = side; 
	}

	public Cube(Cube c) {
		this(c.side);
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		if(side > 0) {
			this.side = side;
		}
	}
	
	public double calculateVolume() {
		return side * side * side;
	}
	
	public double volumeDifference(Cube c) {
		return calculateVolume() - c.calculateVolume();
	}
	
	public String toString() {
		return "Cube's side length: " + side;
	}
}