package geometry;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel {

	public static void main(String[] args) {
		JFrame drawingFrame = new JFrame();
		drawingFrame.setSize(1200, 1000);
		drawingFrame.setLocationRelativeTo(null);
		Drawing panel = new Drawing();
		drawingFrame.add(panel);
		drawingFrame.setVisible(true);
	}
	
	public void paint(Graphics g) {
		Point p1 = new Point(400,300);
		Point p2 = new Point(400,400);
		Line l1 = new Line(new Point(500,450),new Point(750,550));
		Shape[] niz = {p1,p2,l1};
		for(Shape s: niz) {
			//s.moveBy(100, 100);
			s.moveTo(250, 250);
			s.draw(g);
		}
		/*Circle c1 = new Circle(p1,60);
		Rectangle r1 = new Rectangle(p2,50,50);
		c1.draw(g);
		r1.draw(g);*/
	}
	
	public Drawing() {

	}

}
