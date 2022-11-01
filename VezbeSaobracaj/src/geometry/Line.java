package geometry;

public class Line {

	private Point startPoint;
	private Point endPoint;
	private boolean selected;
	
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
