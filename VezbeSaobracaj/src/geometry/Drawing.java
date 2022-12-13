package geometry;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

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
		/*Point p1 = new Point(400,300);
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
		
		ArrayList<Shape> lista = new ArrayList<Shape>();
		Point p1 = new Point(300,300);
		Line l1 = new Line(p1, new Point(400,400));
		Rectangle r1 = new Rectangle(p1,50,50);
		Circle c1 = new Donut(new Point(500,500),40,30);
		Donut d1 = new Donut(new Point(500,600),40,20);
		lista.add(p1);
		lista.add(l1);
		lista.add(r1);
		lista.add(c1);
		lista.add(d1);
		
		/*for(Shape s: lista) {
			//s.moveBy(10, 0);
			s.draw(g);
		}*/
		
		//lista.get(1).draw(g);
		/*Iscrtati poslednji element liste (podrazumeva se da se ne zna šta se nalazi u 
		 * listi),*/
		//lista.get(lista.size()-1).draw(g);
		//Izbaciti drugi element liste,
		//lista.remove(1);
		//Iscrtati drugi element liste,
		//lista.get(1).draw(g);
		//Iscrtati element sa indeksom tri,
		//Dodati liniju u listu tako da ona bude četvrti element liste,
		//lista.add(3, l1);
		//Iscrtati samo krugove i
		//Iscrtati samo površinske oblike (krug, krug sa rupom, pravougaonik)
		for(Shape s: lista) {
			if(s instanceof Circle || s instanceof Rectangle) {
				s.draw(g);
			}
		}
		
	}
	
	public Drawing() {

	}

}
