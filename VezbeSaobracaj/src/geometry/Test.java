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
		
		Point p1 = new Point();
		p1.setX(5);
		p1.setY(5);
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		
		Point p2 = new Point(10,10,true);
		System.out.println(p2.getX());
		System.out.println(p2.getY());
		p2.setX(50);
		System.out.println(p2.getX());
		
		System.out.println(p1);
	}

}
