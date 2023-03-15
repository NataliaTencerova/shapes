package Shapes;

import java.util.Scanner;

public class Plane_figures {
	private Line line;
	public static Scanner sc;
	
	
	public Point2D insertPoint() {
		System.out.println("Pick a point name: ");
		char name = sc.nextLine().charAt(0);
		Point2D point = new Point2D(name);
		insertPointCoordinates(point);
		
		return point;
	}
	
	public void insertPointCoordinates(Point2D point) {
		System.out.println("Insert x coordinates: ");
		int x = sc.nextInt();
		System.out.println("Insert y coordinates: ");
		int y = sc.nextInt();
		
		point.setX(x);
		point.setY(y);
		sc.nextLine();
	}
	
	public void loadLine() {
		Point2D a = insertPoint();
		Point2D b = insertPoint();
		line = new Line(a, b);
	}
	
	public void draw() {
		System.out.println(line);
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		Plane_figures pf = new Plane_figures();
		pf.loadLine();
		pf.draw();

	}
}