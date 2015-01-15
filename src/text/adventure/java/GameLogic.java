package text.adventure.java;

import java.util.Random;
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
	private Random rand;
	private Scanner sc;
	
	
	
	int playerHealth;
	int playerAttack;
	int playerHealPots;
	int healPots;
	int playerdefence;
	int randomPlayerAttack;
	
	int enemyAttack;
	int enemyHealth;
	int enemyDefence;
	String enemyName;
	

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
		this.rand = new Random ();
		
		
		this.playerHealth =  player.playerHealth;
		this.playerAttack = player.playerAttack;
		this.playerHealPots = player.playerHealPots;
		this.healPots =  player.healPots;
		this.playerdefence = player.playerDefence;
		
		
		
		this.enemyAttack = enemy.enemyAttack ();
		this.enemyHealth = enemy.enemyHealth ();
		this.enemyDefence  = enemy.enemyDefence();
		this.enemyName = enemy.enemy;
		
	}

	/**
	 * say Hi
	 */
	public void welcome() {
		System.out.println("Welcome to the Dungeon!\n");
		this.pause(0.5);

		
		// yolo laden^^
		System.out.print(".");
		this.pause(0.25);
		System.out.print(".");
		this.pause(0.25);
		System.out.print(".");
		this.pause(0.25);
		System.out.print("loading\n");
		this.pause(0.25);
	}

	/**
	 * starts the Game
	 */
	public void runGame() {

		// hi
		this.welcome();
		
		GAME:
		while (running) {

			// show possibilities
			System.out.println("What do you want to do?");
			System.out.println("\t1. Go deeper into the Dungeon!");
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
		System.out.println ("An " + enemyName + " appeared");
		System.out.println ("HP " + this.enemyHealth);
		System.out.println ("What do you want to do now?");
		this.enemyDecision();
	}
		
	public void enemyDecision () {
		
		System.out.println ("\t1.Attack");
		System.out.println ("\t2.Defence");
		System.out.println ("\t3.Heal");
		System.out.println ("\t4.Run");
		this.secondCommand ();
		
		
	}
	
	public void secondCommand () {
		String stringChoice = "please enter your choice";
		System.out.println (stringChoice);
		this.attackBefehl();
		
	}
	
	public void attackBefehl () {
		
		String cmd2 = this.sc.next();
		
		
		if (cmd2.equals ("1")) {
			this.attack();	
		}
		
		else if (cmd2.equals ("2")) {
			
		}
		
		else if (cmd2.equals ("3")){
			
		}
		else if (cmd2.equals("4")){
			
		}
		else {
			System.out.println ("error");
		}
	}
	
		private void attack () {
		
		System.out.println ("You swing your sword");
		
		int damageDone = this.playerAttack1();
		System.out.println ("You deal " + damageDone + " damage");
		if (enemyHealth < 1) {
			enemyHealth = 0;
		}
		this.enemyHealth = this.enemyHealth - damageDone;
		System.out.println("The enemy has " + this.enemyHealth + " HP left");
		
		if (enemyHealth < 1) {
			System.out.println ("You defeated the enemy");
		}
		else {
			System.out.println ("The enemy is still standing");
			this.attackBefehl();
		}
		
		
		}
		
		
		
	
		
	
	
		private int playerAttack1 () {
			playerAttack = rand.nextInt(this.playerAttack);
			return playerAttack;
		}
	
	

	private void Switch(int a) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * action heal
	 */
	
	//Probleme mit playerHealth => kommt immer 0 raus. Egal ob hier oder oben
	public void heal() {
		System.out.println("You take a heal pot");
		
		if (playerHealPots <= 0)
		{
			System.out.println ("You don´t have any Healpots left");
			playerHealth = playerHealth + 0; 
			
			if (playerHealPots < 0) {
				playerHealPots = 0;
			}
		}
		
		else  {
			playerHealth = playerHealth + healPots;
			playerHealPots--;
		}
		System.out.println ("You have now " + playerHealPots +  " pots left" );
		System.out.println ("You have " + playerHealth + " HP");
		
		
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
		System.out.println("You are leaving the Dungeon");
	
		System.out.println ("#----------------------------------#");
		System.out.println ("Thank you for playing!");
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
