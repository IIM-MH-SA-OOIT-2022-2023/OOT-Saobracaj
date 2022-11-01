package geometry;

public class Point {

	private int x;
	private int y;
	private boolean selected;
	
	public double distance(Point p) {
		int dx = this.x - p.getX();
		int dy = this.y - p.getY();
		return Math.sqrt(dx*dx + dy*dy);
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public boolean isSelected() {
		return selected;
	}
}
