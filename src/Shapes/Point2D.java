package Shapes;

public class Point2D {
	private char name;
	private int x;
	private int y;
	
	public Point2D(char name, int x, int y) {
		this.name = name;
		this.x = x;
		this.y = y;
	}
	
	public Point2D(char name) {
		this(name, 0, 0);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public char getName() {
		return name;
	}
	
	public String toString() {
		return " "+name+"["+x+", "+y+"]"; 
	}
	
	public double distance(Point2D b) {
		return Math.sqrt(((x-b.x)*(x-b.x)) + ((y - b.y)*(y - b.y)));
	}
	
}