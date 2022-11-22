package prviTest;

public class Test {

	public static void main(String[] args) {
		/*int brojac = 101;
		while(brojac >= 1) {
			if(brojac%2 == 0) {
				System.out.println(brojac);
			}
			brojac = brojac - 1;
		}*/
		
		for(int i = 1; i<=101; i++) {
			if(i%2 == 0) {
				System.out.println("Kvadrat broja " + i + " je: " + i*i);
			}
		}
		//Treci zadatak
		//k.getUpperLeft().setY(t1.getX() - lin.getStartPoint().getY());

	}

}
