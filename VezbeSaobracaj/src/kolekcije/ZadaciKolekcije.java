package kolekcije;

import java.util.HashMap;
import java.util.Map;

public class ZadaciKolekcije {

	public static void main(String[] args) {
		//4,5,6,7,8 
		
		int[] brojevi = new int[5];
		// index 0 - 0
		// index 1 - 0
		// index 2 - 0
		// index 3 - 0
		// index 4 - 0
		
		brojevi[0] = 4;
		brojevi[1] = 5;
		brojevi[2] = 6;
		brojevi[3] = 7;
		brojevi[4] = 8;
		
		for(int i = brojevi.length - 1; i>= 0; i--) {
			//System.out.println(brojevi[i]);
	}
		
		//int[] brojevi2 = {8,7,6,5,4};
		int[] niz = {2,4,6,8,10,12,14,16,18,20};
		for(int i = 0; i<niz.length; i++) {
			//System.out.println(niz[i] * 5);
		}
		
		
		HashMap<String, String> mapa = new HashMap<String,String>();
		/*
		 *  txt, notepad.exe, 
			bmp, paint.exe, 
			dib, paint.exe, 
			rtf, wordpad.exe 
		 */
		mapa.put("txt", "notepad.exe");
		mapa.put("bmp", "paint.exe");
		mapa.put("dib", "paint.exe");
		mapa.put("rtf", "wordpad.exe");
		
		for(String s : mapa.keySet()) {
			System.out.println(s);
		}
		
		for(String s: mapa.values()) {
			System.out.println(s);
		}
		
		for(Map.Entry<String, String> s : mapa.entrySet()) {
			System.out.println(s);
		}
		
		
		
	}
}
