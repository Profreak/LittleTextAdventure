package text.adventure.java;

import java.util.Scanner;

public class GameLogic {

	
	public void GameLogic () {
		
		Enemy enemy = new Enemy ();
		enemy.Enemy ();
		
		Player player = new Player ();
		player.player ();
		 
	Scanner sc = new Scanner(System.in);
	String action = sc.next();
	
	boolean running = true;
	while (running) {
		
		System.out.println ("\t1. Go further down into the Dungeon!");
		System.out.println ("\t2. Search this area");
		System.out.println ("\t3. Leave the Dungeon");
		System.out.println ("\t4. Heal");
		
		if (action.equals (1)) {
			System.out.println("An" + "" + enemy + "appeared");
		}
		
	
		while (enemy.isAlive()) {
			
			System.out.println ("\t1. Attack");
			System.out.println ("\t2. Defence");
			System.out.println ("\t3. Heal");
			System.out.println ("\t4. run");
		
			
			
		}
			
		}
		
	}


		
	}


