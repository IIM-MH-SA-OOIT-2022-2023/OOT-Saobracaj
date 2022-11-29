package geometry;

import java.awt.Graphics;

public class Circle extends Shape {

	private int radius;
	private Point center;
	
	public Circle() {
		
	}
	
	public Circle(Point center, int radius) {
		this.radius = radius;
		this.center = center;
	}
	
	public Circle(Point center, int radius,boolean selected) {
		this(center,radius);
		this.selected = selected;
	}
	
	public double area() {
		return radius*radius*Math.PI;
	}
	
	public double circumference() {
		return 2*radius*Math.PI;
	}
	
	public boolean contains(int x, int y) {
		return (center.distance(new Point(x,y))<= radius);
	}
	
	public boolean contains(Point p) {
		return contains(p.getX(), p.getY());
	}
	
	@Override
	public String toString() {
		return "Center: ("+ center.getX()+ ", " + center.getY()+"), radius = " + radius;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Circle) {
			Circle temp = (Circle)obj;
			if(this.radius == temp.getRadius()) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawOval(center.getX(), center.getY()
				, radius, radius);
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	
}
