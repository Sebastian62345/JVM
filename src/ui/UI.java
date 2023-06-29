package ui;

import org.apache.log4j.Logger;

public class UI {
	
	static Logger LObj = Logger.getLogger(UI.class);
	public static void main(String[] args) {
		LObj.debug("Start Game");
		System.out.println("Witaj w grze która polega na odgadnięciu litery albo cyfry która wylosuje:");
		System.out.println("Wpisz cyfre 1 jeśli chcesz zgadnąć jaką liczbę wylosowałem z zakresu 0 - 100 ");
		System.out.println("Wpisz literę A jeśli chcesz zgadnąć jaką litere wylosowałem z zakresu A - Z ");
		
		
		LObj.debug("Finish Game");
		
	}

}
