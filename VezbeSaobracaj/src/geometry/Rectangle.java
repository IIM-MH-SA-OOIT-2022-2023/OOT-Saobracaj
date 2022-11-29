package geometry;

import java.awt.Graphics;

public class Rectangle extends Shape{

	private Point upperLeft;
	private int width;
	private int height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(Point upperLeft, int width, int height) {
		this.upperLeft = upperLeft;
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(Point upperLeft, int width, int height, boolean selected) {
		this(upperLeft,width,height);
		this.selected = selected;
	}
	
	public int area() {
		return width*height;
	}
	
	public int circumference() {
		return 2*height+2*width;
	}
	
	public boolean contains(int x, int y) {
		return (upperLeft.getX() <= x && upperLeft.getX()+width >= x
				&& upperLeft.getY() <= y && upperLeft.getY()+height >= y);
	}
	
	public boolean contains(Point p) {
		return contains(p.getX(), p.getY());
	}
	
	@Override
	public String toString() {
		return "Upper left point: (" + upperLeft.getX()+ ", " + upperLeft.getY() + 
				", width = " + width + ", height = "+ height;
	}
	
	@Override 
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle temp = (Rectangle)obj;
			if(this.height == temp.getHeight() && this.width == temp.getWidth()) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawRect(upperLeft.getX(), upperLeft.getY(), 
				width, height);
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public Point getUpperLeft() {
		return upperLeft;
	}
	
	public void setUpperLeft(Point upperLeft) {
		this.upperLeft = upperLeft;
	}
}
