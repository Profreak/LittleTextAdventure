package text.adventure.java;

import java.util.Scanner;

public class GameLogic {

	
	
	public void GameLogic () {
		
		Enemy enemy = new Enemy ();
		enemy.Enemy ();
		
		Player player = new Player ();
		player.player ();
		 
	enemy.getClass();
	
	Scanner sc = new Scanner(System.in);
	String action = sc.next();
	
	System.out.println ("Welcom to the Dungeon!");
	
	
	boolean running = true;
	while (running) {
		
		System.out.println ("#-----------------------------#");
		
		System.out.println ("\t1. Go further down into the Dungeon!");
		System.out.println ("\t2. Search this area");
		System.out.println ("\t3. Leave the Dungeon");
		System.out.println ("\t4. Heal");
		
		if (action.equals (1)) {
			System.out.println("An" + "" + enemy + "appeared");
			
			
			/** Bräuchte kurz deine Hilfe Ludi.
			 * Kann nicht auf die gegenrisch erzeugte Lebensanzeige zugreifen.
			 * Jedoch funktioniert die Sache bei der player Klasse wunderbar. 
			 * Grüße Alex
			 * 
			 */
			System.out.println (enemy.enemyHealth + " HP");
			
		}
		else if (action.equals("2")) {
			System.out.println ("You are searching this area for something");
			
		}
		else if (action.equals("3")) {
			System.out.println ("You are leaving the Dungeon");
		}
		else if (action.equals("4")) {
			player.playerHealPots--;
			player.playerHealth = player.playerHealth + player.healPots;
			System.out.println ("You drink a heal pot");
		}
		
		else {
			System.out.println ("invalid command");
		}
	
		
		
			
		}
			
		}
		
	}


		
	


