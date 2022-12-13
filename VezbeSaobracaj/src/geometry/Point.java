package geometry;

import java.awt.Graphics;

public class Point extends Shape {

	private int x;
	private int y;
	
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
	
	public boolean contains(int x, int y) {
		//Point p1 = new Point(x,y);
		return distance(new Point(x,y))<=2;
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
	
	@Override
	public void draw(Graphics g) {
		g.drawLine(x + 2, y, x - 2, y);
		g.drawLine(x, y + 2, x, y - 2);
		
	}
	
	@Override
	public void moveTo(int x, int y) {
		this.x =  x;
		this.y = y;
	}

	@Override
	public void moveBy(int byX, int byY) {
		x = x + byX;
		y = y + byY;
	}
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof Point) {
			Point temp = (Point)o;
			return ((int)(this.distance(new Point(0,0)) - temp.distance(new Point(0,0))));
		}
		return 0;
		
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

	

	


}
