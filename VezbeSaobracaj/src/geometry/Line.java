package geometry;

import java.awt.Graphics;

public class Line extends Shape {

	private Point startPoint;
	private Point endPoint;
	
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
	
	public boolean contains(int x, int y) {
		double d1 = startPoint.distance(new Point(x,y));
		double d2 = endPoint.distance(new Point(x,y));
		double razlika = length() - (d1+d2);
		return razlika <= 2 && razlika >= 0;
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
	
	@Override
	public void draw(Graphics g) {
		g.drawLine(startPoint.getX(), startPoint.getY()
				, endPoint.getX(), endPoint.getY());
	}
	
	@Override
	public void moveTo(int x, int y) {
		//Metoda nema implementaciju
	}

	@Override
	public void moveBy(int byX, int byY) {
		//startPoint.setX(startPoint.getX()+byX); - losa implementacija
		//byX = 20, byY = 30
		startPoint.moveBy(byX, byY);
		endPoint.moveBy(byX, byY);
		
	}
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof Line) {
			Line temp = (Line)o;
			return ((int)(this.length() - temp.length()));
		}
		return 0;
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
