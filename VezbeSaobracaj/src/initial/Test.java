package initial;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		/*
		 * int prviBroj = 24; int drugiBroj = 12; char operation = '-';
		 * 
		 * if(operation == '+') { System.out.println(prviBroj + drugiBroj); } else
		 * if(operation == '-') { if(prviBroj > drugiBroj) { System.out.println(prviBroj
		 * - drugiBroj); }else { System.out.println(drugiBroj-prviBroj); } }
		 */
		
		//Sluzi za citanje inputa sa konzole
		int korisnikovBroj;
		System.out.println("Unesi broj");
		Scanner it = new Scanner(System.in);
		korisnikovBroj = it.nextInt();
		
		//Logika zadatka
		//FOR petlja
		if(korisnikovBroj<200) {
			int rezultat = 0;
			for(int i=0; i<=korisnikovBroj;i+=2) {
				rezultat+=i;
				//rezultat = rezultat + i;
			}
			System.out.println("Rezultat for petlje: " + rezultat);
			
		}else {
			System.out.println("Broj mora biti manji od 200");
		}
		
		//WHILE Petlja
		int brojac = 0;
		int rezultat = 0;
		while(brojac<=korisnikovBroj) {
			if(brojac == 130) {
				brojac+=2;
				break;
			}
			rezultat = rezultat + brojac;
			brojac+=2;
			
		}
		System.out.println("Rezultat while petlje: " + rezultat);
		
		
		//DO-While Petlja
		rezultat = 0;
		brojac = 0;
		do {
			rezultat = rezultat + brojac;
			brojac = brojac + 2;
		}
		while(brojac<=korisnikovBroj);
		System.out.println("Rezultat do-while petlje: " + rezultat);
		
		
		//ZADATAK 2 - BROJ PRESTUPNIH GODINA OD 2022. DO 2100.
		int brojPrestupnihGodina = 0;
		/*for(int i = 2022; i<=2100; i = i+2) {
			if(i%4 == 0) {
				brojPrestupnihGodina++;
			}
			
		}*/
		
		for(int i = 2022; i<=2100; i= i+4) {
			if(i == 2022) {
				i = i+2;
				brojPrestupnihGodina++;
				continue;
			}
			brojPrestupnihGodina++;
		}
		System.out.println("Broj prestupnih godina je: " + brojPrestupnihGodina);
	}
}
