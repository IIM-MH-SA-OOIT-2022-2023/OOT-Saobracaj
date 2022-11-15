package geometry;

public class Test {

	public static void main(String[] args) {
		
		/*Point p1 = new Point();
		int vrednost = 20;
		System.out.println(vrednost);
		System.out.println(p1);
		
		System.out.println(p1.getX());
		//System.out.println(p1.getY());
		//System.out.println(p1.selected);
		
		p1.x = 50;
		System.out.println(p1.x);
		
		Point p2 = new Point();
		p2 = p1;
		System.out.println(p2.x);
		p1.x = 33;
		System.out.println(p2.x);
		
		p1.setX(5);
		p1.setY(4);
		
		Point p2 = new Point();
		p2.setX(1);
		p2.setY(1);
		
		System.out.println(p1.distance(p2));
		
		Line l1 = new Line();
		System.out.println(l1.getEndPoint());
		System.out.println(l1.getStartPoint());
		l1.setStartPoint(p1);
		l1.setEndPoint(p2);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(l1.getStartPoint().getX());
		System.out.println(l1.getEndPoint().getX());*/
		
		//Vezbe 4
		
		/*Point p1 = new Point();
		p1.setX(5);
		p1.setY(5);
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		
		Point p2 = new Point(10,10,true);
		System.out.println(p2.getX());
		System.out.println(p2.getY());
		p2.setX(50);
		System.out.println(p2.getX());
		
		System.out.println(p1);*/
		
		//Vezbe
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		//System.out.println(r1 == r2);
		
		Point p1 = new Point(5,5,true);
		Point p2 = new Point(5,5,false);
		Object p3 = new Point(5,5,false);
		Line l1 = new Line(p1,p2);
		Circle c1 = new Circle(new Point(7,7),15);
		Circle c2 = new Circle(new Point(8,8),15);
		
		System.out.println(p1.equals(p3));//true
		System.out.println(l1.equals(r1));//false 
		System.out.println(c1.equals(c2));//true
		System.out.println(r1.equals(r2));//true
		System.out.println(c1.equals(p2));//false
		
		
		
		
	}

}
