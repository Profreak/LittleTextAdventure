package text.adventure.java;

import java.util.Scanner;

/**
 * 
 * This class represents the Game Logic of this Text Adventure. Travel into the
 * dark and Kill your Enemy!
 * 
 * @author Alexandros Angeloussis
 *
 */
public class GameLogic {

	// KLassen Variabeln
	private Player player;
	private Enemy enemy;
	private boolean running;
	private Scanner sc;

	/**
	 * 
	 * !!! constructor !!! build a new Game
	 */
	public GameLogic() {
		// wenn this. geschriebenw wird ... sind immmer! Klassenvariabeln
		// gemeint
		this.player = new Player();
		this.enemy = new Enemy();
		this.running = true;
		this.sc = new Scanner(System.in);
	}

	/**
	 * say Hi
	 */
	public void welcome() {
		System.out.println("Welcome to the Dungeon!\n");
		this.pause(0.5);

		
		// yolo laden^^
		System.out.print(".");
		this.pause(0.5);
		System.out.print(".");
		this.pause(0.5);
		System.out.print(".");
		this.pause(0.5);
		System.out.print("loading\n");
		this.pause(0.5);
	}

	/**
	 * starts the Game
	 */
	public void runGame() {

		// hi
		this.welcome();

		while (running) {

			// show possibilities
			System.out.println("What do you want to do?");
			System.out.println("\t1. Go deeper to the Dungeon!");
			System.out.println("\t2. Take a Healpot");
			System.out.println("\t3. Search the area");
			System.out.println("\t4. leave the Dungeon" + "\n");

			// Read new Command
			// local variabel oder methoden variabel
			String cmd = this.nextCommand();

			// parse the command
			this.wennBefehle(cmd);

		}

	}

	/**
	 * reads the next line of user input
	 * 
	 * @return a String coded Command
	 */
	public String nextCommand() {
		System.out.print("Please enter your choice >");
		return this.sc.next();
	}

	/**
	 * this method parse an command and calls the correct method
	 * 
	 * @param c
	 */
	public void wennBefehle(String c) {

		// local variabel oder methoden variabel
		int cmd = Integer.parseInt(c);

		switch (cmd) {
		case 1:
			this.goDeeper();
			break;

		case 2:
			this.heal();
			break;

		case 3:
			this.search();
			break;

		case 4:
			this.leave();
			break;
		}

	}

	/**
	 * action go deeper
	 */
	public void goDeeper() {
		System.out.println("You go deeper into the Dungeon");
		// TODO
	}

	/**
	 * action heal
	 */
	public void heal() {
		System.out.println("");
		// TODO
	}

	/**
	 * action search something
	 */
	public void search() {
		System.out.println("");
		// TODO
	}

	/**
	 * Action leave the dungeon
	 */
	public void leave() {
		System.out.println("");
		// diest ist der Befehl zum beenden des Programmes
		System.exit(0);
	}

	/**
	 * paused the game for n seconds
	 * 
	 * @param n
	 *            seconds
	 */
	public void pause(double n) {

		// versuchs gar nicht erst es zu verstehen :)
		try {
			Thread.sleep((int) (n * 1000));
		} catch (InterruptedException error) {
			error.printStackTrace();
		}

	}

}
