package text.adventure.java;

import java.util.Scanner;
import java.util.Random;

public class GameLogic {
	
	Player player = new Player ();
	Enemy enemy = new Enemy ();
	boolean running = true;
	Scanner sc = new Scanner (System.in);
	String  action = sc.next();
	
	
	public void begrüßung () {
		
		System.out.println ("Welcome to the Dungeon!");
		
	}
	
	public void gameSchleife () {
		
		while (running) {
			
			System.out.println ("What do you want to do?");
			System.out.println ("\t1. Go deeper to the Dungeon!");
			System.out.println ("\t2. Take a Healpot");
			System.out.println ("\t3. Search the area");
			System.out.println ("\t4. leave the Dungeon");
		
		}
		
	}
	
	
	
	public void wennBefehle () {
		if (action.equals("1")) {
			System.out.println ("You go deeper into the Dungeon");
		}
		
	}
	
	
	public void pause() {

		
		System.out.println("Welcome to the Dungeon!");

		// pausiert das Spiel um 1 Sekunde! Ist in double ... Es sind also auch
		// 0.5 sekunden moeglich
		// bsp: pause(0.5);
		pause(1);
		}
	public void attack () {
		
		
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
