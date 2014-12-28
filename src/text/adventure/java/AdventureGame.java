package text.adventure.java;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * Diese Klasse verwaltet und fuehrt das Adventure Game aus
 * 
 * @author Alexandros Angeloussis
 *
 */
public class AdventureGame {

	// Class variables

	private static String[] enemies = { "Zombies", "Warrior", "Knight",
			"Hellhound", "Mage", "Werwolf", };

	// solche definitionen sind keine klassischen Variabeln.. Es sind
	// Konstanten.
	// Konstanten werden so geschrieben.. Wichtiger Unterschied: KOnstanten
	// koennen nicht waehrend der Laufzeit geaendert werden!
	// Java konform werden diese Variabeln gross und mit unterschrichen
	// geschrieben
	private static final int MAX_ENEMY_HEALTH = 75;
	private static final int MAX_ENEMY_ATTACK = 40;
	private static final int MAX_ENEMY_DEFENCE = 10;

	// player variables
	// villeicht solltest du eine Klasse Player anlegen und die werte hier darin
	// speichern und darueber abrufen. Wenn du ein Beipsiel bruachst kann ich
	// dir entweder Enemy oder Player mal in eine Klasse packen.
	// TODO Player Klasse
	private int playerHealth = 100;
	private int playerAttack = 50;
	private int playerHealpot = 3;
	private int playerDefence = 10;

	private int Healpot = 30;

	// wichte Randvariablen
	private Scanner in;
	private Random rand;
	// Variablen kann man hier intalizieren ... will man aber nicht. Sondern im
	// contructor. Hier wollen wir sogar das spiel nicht gestartet haben,
	// sondern erst wenn startGame() aufgerufen wird. Konstanten werden
	// allerdings nicht hier initalisiert.
	// alte Zeile : private boolean running = true;
	// TODO initalizierung der KLassenvariablen im Konstruktor
	private boolean running;

	/**
	 * THE CONSTRUCTOR zur info.. ein constructor hat generell kein rueckgabe
	 * wert. Er heisst genauso wie die klasse und ist entweder private oder
	 * public ... generell willst du das er public ist, da sonst niemand auf
	 * diese Klasse zugreifen kann
	 * 
	 * initialize a new Adventure Game
	 * 
	 * @param passScanner
	 *            der Scanner
	 * @param passRandom
	 *            der Radome Generator
	 */
	public AdventureGame(Scanner passScanner, Random passRandom) {

		// zur Info scanner und random werden von der MainClass erstellt und
		// hier in den klassen variabeln gespiechert.
		this.in = passScanner;
		this.rand = passRandom;
		this.running = false;
	}

	/**
	 * starts the game
	 */
	public void startGame() {

		// running muss true sein damit es losgehen kann
		running = true;

		// Servus
		println("Welcome to the Dungeon");

		// starte spiel
		while (running) {
			// zur uebersicht pack ich das in eine methode.
			this.executeMainMenu();
		}
	}

	/**
	 * "Main Menu" des Game
	 * 
	 * 
	 * @param in
	 *            Scanner
	 * @param rand
	 *            Random Zahl
	 */
	private void executeMainMenu() {

		// wenn du eine leerzeile machen willst kannst du einfach schreiben:
		// println(""); oder du schreibst im Text : \n das funktioniert genauso
		// wie das \t.
		println("#--------------------------------------------#");

		println("What do you want to do next?");
		println("\t1. I´m aware how dangerous my journey will be and I decide to explore the dungeon!");
		println("\t2. I want to investigate the room");
		println("\t3. I want to leave the dungeon");

		String action = in.next();

		// Action explore
		// zur info .equals vergleicht zwei strings miteinander. das ist gut..
		// du kannst also auch den text "attack" erwarte. Sei gewanrt. ein
		// Leerzeichen ist leider gottes auch ein Zeichen.
		// an der stelle kann man uebrigens auch switch anweisungen verwenden.
		// TODO switch ausprobieren
		// TODO natuerlichen text wie "attack" ausprobieren
		if (action.equals("1")) {
			// zur uebersicht pack ich das in eine methode.
			explore();
		}

		// TODO Action investigate

		// TODO Action leave

	}

	/**
	 * Hier wird die action explore ausgefuehrt ... es spawnt beispielsweise ein
	 * Zombie
	 * 
	 * @param rand
	 *            randome zahl
	 * @param in
	 *            Scanner
	 */
	private void explore() {
		// variablen der gegnerischen stat´s
		String enemy = enemies[rand.nextInt(enemies.length)];
		int enemyHealth = rand.nextInt(MAX_ENEMY_HEALTH);
		int enemyAttack = rand.nextInt(MAX_ENEMY_ATTACK);
		int enemyDefence = rand.nextInt(MAX_ENEMY_DEFENCE);

		while (enemyHealth > 1) {
			println("You have " + playerHealth + " HP");
			println("An enemy appeared out of the darkness");

			// das gewurstel hier kann man auch schoener loesen. Aber du hast es
			// auf jedenfall korreckt und einfach geloest.
			// Als Tip: eigentlich willst du Enemy abstrahieren und eine Klasse
			// Enemy gruenden.
			// wenn du dann ein Enemy erstellst. wird automatisch ein richtiger
			// enemy erzeugt.
			// mich juckt es in den finger dir das vorzuprogammieren^^ aber ich
			// lass es.
			// wenn du willst das wir das gemeinsam proggen dann sag es^^
			// TODO Klasse Enemy erstellen.
			// TODO switch ausprobieren

			if (enemy.equals("Zombie")) {
				System.out
						.println("A brain sucking "
								+ enemy
								+ " appeared out of the darkness \n and is slowly turning his rotten face in your face in your dirction");
			}

			else if (enemy.equals("Warrior")) {
				System.out
						.println("A misterios shape appeared in front of you. \n You recognize a knight who is driven crazy and attacks you ");
			} else if (enemy.equals("Knight")) {
				println("Suddenly a crazy grandpa appears! He carries a lance and ride on a wooden horse! He screams: FOR GLORY AND HONOR!");

			} else if (enemy.equals("Hellhound")) {
				println("wuff");
			}

			println("What do you want to do?");
			println("\t1. Attack");
			println("\t2. Defence");
			println("\t3. Potion");
			println("\t4. Run!");

			// Dadurch das ich eine Methode definiert habe ... ist das nicht
			// mehr das selbe action wie in startGame()
			String action = in.next();

			// Action attack
			// siehe main menu
			if (action.equals("1")) {
				// eigentlich sollte jede moegliche action wahrend einer
				// exploration eine eigene Methode bekommen um die uebersicht zu
				// wahren.
				// TODO Methoden einguren.
				// eclipse macht alles einfacher. Du muesstest eigentlich ein
				// fesnter haben das "Outline" heisst. Darin werden alle
				// Variabeln und methoden namen angezeigt wenn du darauf
				// doppelklicks kommst du direkt zu der gewnuenschten methode.

				// die attacke kann aber auch 0 sein....
				// du solltest eher schaden machen wie 4-7 oder sowas
				// TODO atacken fixen
				// TODO defence einfuehren
				int GameAttack = rand.nextInt(playerAttack);

				enemyHealth -= GameAttack;
				playerHealth -= enemyAttack;

				println("You swing your mighty weapon and deal " + GameAttack
						+ " damage");
				println("In substitude your enemy deals " + enemyAttack
						+ " damage ");

				// Das Problem ist das du nie deinen Gegner toetest da dein
				// gegener immer mehr schaden macht als du selbst.
				// Print zur probe einfach man EnemyHealth aus und du wirst
				// sehen das das schon komisch ist^^
				// println("Enemy Health: " + enemyHealth);

				if (enemyHealth < 1) {
					println("Your enemy dies ... Poor enemy ");
				}

				if (playerHealth < 1) {
					if (enemyHealth < 1) {
						println("... but ...");
					}
					// aua ... was passiert jetzt? du beendest alle schleifen
					// und beendest das spiel so.
					// wenn du das mit break machst kannst du dir die running
					// bollean sparen^^ und direkt true in die schleife
					// schreiben
					println("You got badly wounded");
					break;
				}

			}

			// Defence attack

			// Potion attack

			// Run! attack
		}
	}

	/**
	 * Um schreibarbeit zu vermeiden. Ein sogenannter "wrapper". Ich spar mir
	 * das System.out. zu schreiben XD
	 * 
	 * @param text
	 *            der auszugebene Text
	 */
	public void println(String text) {
		System.out.println(text);
	}

}
