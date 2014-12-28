package text.adventure.java;

import java.util.Scanner;
import java.util.Random;

/**
 * 
 * Diese Klasse deklaiert und initializiert ein Spiel
 * 
 * Sieht ziemlich nutzlos aus ... ist es auch ^^ aber so wird das gemacht.
 * Spaeter hat es sogar einen Sinn und Vorteile es so zu machen.
 * 
 * 
 * Ich habe viel geschrieben und nicht korrecktur gelesen ich hoffe ich konnte
 * irgendwie helfen.
 * 
 * @author Alexandros Angeloussis
 *
 */
public class MainClass {

	// Java hat spezielle KOmmentare für Methoden und Klassen .. Sie beginnen
	// mit /** und hören mit */ auf. innerhalb dieses Bereiches wird ein
	// beschriebender Text erwartet. Alle Texte die mit @ gekennzeichnet sind,
	// sind spezielle infos beispielweise ueber Parameter oder den author oder
	// datum etc. Wenn du mehr wissen willst einfach mal nach JavaDoc suchen

	// eclipse unterstuetzt JavaDoc automatisch. Du kannst einfach /** eingeben
	// vor einer Klasse oder Methode nachdem du sie erstellt hast und eclipse
	// baut dir automatisch den Javadoc.. du musst nur noch text reinschreiben.

	// es gibt in eclipse verschiedene hotkeys die ganz nuetzlich sind.
	// SHIFT + STRG + F formatiert dir den Text einr Java Klasse automatisch
	// nach bestimmten vorgaben
	// Wenn du den Namen einer Klasse oder den namen einer Variabel auswaehlst
	// und dir ploetzlich der name nicht mehr gefaelt hast du das problem das du
	// theoretisch alle namen aendern must.. bei zwanzig mal den namen aendern
	// hoert hier der spaß auf
	// eclipse schafft hier abhilfe mit dem hotkey SHIFT + STRG + R .. dann
	// erscheint um den Namen ein Kasten. Aender jetzt den Namen innerhalb des
	// Kastens. dann drueck enter und nochmal enter falls eine neues fenster
	// kommt ... das kannst du getrost ignorieren. So hast du alle namen dieser
	// variable geandert.

	// Das Programm startest du wie gewonnt ueber diese Klasse bzw diese main
	// Methode

	/**
	 * Programmeinsprungpunkt
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// deklariere und initialisiere Scanner und Math
		Scanner in = new Scanner(System.in);
		Random rand = new Random();

		// Zur Info man will ein programm gar nicht in den static methoden
		// haben. Sicherheit und Programmiertechnische Vorteile hat es
		// wenn du eine eigene Klasse definierst die das Adventure ausfuehrt.

		// deklariere ein neues Game
		AdventureGame game;

		// initaliziere ein neues Game
		game = new AdventureGame(in, rand);

		// starte dieses Game
		game.startGame();
	}
}
