package Shapes;

public class Shapes {

	public static void main(String[] args) {
		Cube c1 = new Cube(2);
		Cube c2 = null;
		Cube c3 = c1;
		c2 = new Cube(3);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		c3.setSide(1);
		System.out.println(c1.volumeDifference(c3));
		
	}
}
