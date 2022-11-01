package resenjaZadatakaZaSamostalniRad;

public class Zadatak1 {

	public static void main(String[] args) {
		int dan = 0;
		int brojDana = 0;
		int danPoslednjegTermina =25;
		int prviDanTermina = 25;
		int sedmica = 0;
		System.out.println("Termini u kojima se odrzavaju vezbe:");
		for (int godina = 2022; godina <= 2023; godina++) {
			for (int mesec = 10; mesec <= 12; mesec++) {
				sedmica = 0;
				if (mesec == 10 || mesec == 12) {
					brojDana = 31;
					if (mesec == 10) {
						dan = 25;
					}
				} else if (mesec == 11) {
					brojDana = 30;
				} else {
					brojDana = 17;
				}
				for (; dan <= brojDana; dan++) {
					if (dan == brojDana) {
						int danaOdPoslednjegTermina = 0;
						if(mesec!=1) {
							danaOdPoslednjegTermina = brojDana - danPoslednjegTermina;
						}else {
							danaOdPoslednjegTermina = 31 - danPoslednjegTermina;
						}
						prviDanTermina = 7 - danaOdPoslednjegTermina;
						dan = prviDanTermina;
						if(mesec == 12) {
							mesec = 0;
							godina = 2023;
						}
						else if(mesec == 1) {
							if(17 == prviDanTermina + sedmica*7) {
								System.out.println("Termin vezbi: " + 17+"."+mesec+"."+godina+".");
							}
							mesec = 15;
							godina = 2024;
						}
						break;
					}
					else if(dan == prviDanTermina + sedmica*7) {
						System.out.println("Termin vezbi: " + dan+"."+mesec+"."+godina+".");
						sedmica++;
						if(dan+7 > brojDana) {
							danPoslednjegTermina = dan;
						}
					}else if(dan == 25 && mesec == 12) {
						System.out.println("Srecan Bozic!");
					}else if(dan ==1 && mesec == 1) {
						System.out.println("Srecna Nova godina!");
					}else if(dan == 7 && mesec == 1) {
						System.out.println("Srecan Bozic!");
					}
				}
			}
		}

	}

}
