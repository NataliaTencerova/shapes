package Shapes;

public class Line {
	
	private Point2D beginning;
	private Point2D end;
	
	public Line(Point2D beginning, Point2D end) {
		this.beginning = beginning;
		this.end = end;
	}
	
	public LineDirection direction() {
		if(beginning.getX() == end.getX()){
			return LineDirection.VERTICAL;
		}
		else if(beginning.getY() == end.getY()) {
			return LineDirection.HORIZONTAL;
		}
		else {
			return LineDirection.GENERAL;
		}
	}
	
	public String toString() {
		return "Line ("+direction()+"): "+beginning+" ->"+end;
	}
}