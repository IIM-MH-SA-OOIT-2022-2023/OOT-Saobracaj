package geometry;

public class Point {

	private int x;
	private int y;
	private boolean selected;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(int x, int y, boolean selected) {
		//this.x = x;
		//this.y = y;
		this(x,y);
		this.selected = selected;
	}
	
	public double distance(Point p) {
		int dx = this.x - p.getX();
		int dy = this.y - p.getY();
		return Math.sqrt(dx*dx + dy*dy);
	}
	
	@Override
	public String toString() {
		return "(" + this.x + "," + this.y+ ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point temp = (Point)obj;
			if(this.x == temp.getX() && this.y == temp.getY()) {
				return true;
			}
		}
		return false;
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
