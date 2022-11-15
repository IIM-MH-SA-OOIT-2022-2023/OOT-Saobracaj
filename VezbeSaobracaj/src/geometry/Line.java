package geometry;

public class Line {

	private Point startPoint;
	private Point endPoint;
	private boolean selected;
	
	public Line() {
		
	}
	
	public Line(Point startPoint, Point endPoint) {
		this.endPoint = endPoint;
		this.startPoint = startPoint;
	}
	
	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint,endPoint);
		this.selected = selected;
	}
	
	public double length() {
		return startPoint.distance(endPoint);
	}
	
	@Override
	public String toString() {
		return "("+ startPoint.getX() + ", " + startPoint.getY()+ 
				") --> (" + endPoint.getX() + ", " + endPoint.getY()+ ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Line) {
			Line temp = (Line)obj;
			if(this.startPoint.equals(temp.getStartPoint()) &&
					this.endPoint.equals(temp.getEndPoint())) {
				return true;
			}
		}
		return false;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public boolean isSelected() {
		return selected;
	}
	
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	
	public Point getStartPoint() {
		return startPoint;
	}
	
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}
	
	public Point getEndPoint() {
		return endPoint;
	}
}
