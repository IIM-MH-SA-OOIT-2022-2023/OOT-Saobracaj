package geometry;

public class Circle {

	private int radius;
	private Point center;
	private boolean selected;
	
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
	
	@Override
	public String toString() {
		return "Center: ("+ center.getX()+ ", " + center.getY()+"), radius = " + radius;
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
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	
}
