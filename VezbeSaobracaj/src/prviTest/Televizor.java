package prviTest;

public class Televizor {

	private boolean ukljucen;
	private int jacinaZvuka;
	private int brojKanala;
	
	public void pojacaj() {
		if(jacinaZvuka >= 50) {
			System.out.println("Jacina zvuka je vec max");
		}else {
			jacinaZvuka = jacinaZvuka + 1;
		}
	}
}
