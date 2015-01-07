package text.adventure.java;

import java.util.Scanner;
import java.util.Random;

public class GameLogic {

	public void GameLogic() {

		Enemy enemy = new Enemy();
		enemy.getEnemy();
		 
		Player player = new Player();
		player.player();
		int enemyHealth = enemy.enemyHealth;
		
		Random rand = new Random ();

		System.out.println("Welcome to the Dungeon!");

		// pausiert das Spiel um 1 Sekunde! Ist in double ... Es sind also auch
		// 0.5 sekunden moeglich
		// bsp: pause(0.5);
		pause(1);

		

			System.out.println("#-----------------------------#");
			
			System.out.println ("What do you you want to do?");

			System.out.println("\t1. Go further down into the Dungeon!");
			System.out.println("\t2. Search this area");
			System.out.println("\t3. Leave the Dungeon");
			System.out.println("\t4. Heal");

			Scanner sc = new Scanner(System.in);
			boolean running = true;
			while (running) {
				
				System.out.print("Eingabe: ");
				String action = sc.next();
				
			
			if (action.equals("1")) {
				System.out.println("An" + "" + enemy.enemy + "appeared");

				
				
				System.out.println(" What will you do?");
				System.out.println("\t1. Attack!");
				System.out.println("\t2. Defence");
				System.out.println("\t3. Run!");
				System.out.println("\t4. Heal");
				
				String action1 = sc.next ();
				
				Game:
				while (enemy.isAlive()) {
					if (action1.equals("1")) {
						
						
						
						int damageDone = rand.nextInt (player.playerAttack);
						enemy.setEnemyHealth(enemy.getEnemyHealth() - damageDone);
						
						int damageTaken =enemy.getEnemyAttack();
						player.playerHealth -= damageTaken;
						
						System.out.println ("You have " + player.playerHealth +" HP");
						System.out.println ("You deal " + damageDone + " damage");
						System.out.println ("You take " + damageTaken + " damage");
						System.out.println ("You have " + player.playerHealth + " left");
						System.out.println ("The enemy has " + enemyHealth + " left");
						
						if (enemyHealth < 1) {
							System.out.println ("You defeated the enemy");
						}
				
						else if (enemyHealth> 1) {
							continue Game;
						}
				
					}
					
					if (action1.equals("2")) {
						int defence = rand.nextInt(player.playerDefemce);
						int damageTaken =enemy.getEnemyAttack() - defence; 
						player.playerHealth -= damageTaken;
						System.out.println ("You manage to rise you shield");
						System.out.println ("You take " + damageTaken + " damage");
						
						if (player.playerHealth > 1) {
							System.out.println ("The fight goes on");
							System.out.println ("You take " + damageTaken + " damage");
							System.out.println ("You have " + player.playerHealth +" HP");
							System.out.println ("You have " + player.playerHealth + " HP left");
							System.out.println ("The enemy has " + enemyHealth + " HP left");
							
						}
					}
				
					
				}
				
					
			} else if (action.equals("2")) {
				System.out.println("You are searching this area for something");

			} else if (action.equals("3")) {
				System.out.println("You are leaving the Dungeon");
				System.out.println("#----------------------------#");
				System.out.println("Thank you for playing!");
				break;

			} else if (action.equals("4")) {
				player.playerHealPots--;
				player.playerHealth += player.healPots;
				System.out.println("You drink a heal pot");
				System.out.println ("You have now " + player.playerHealth + " HP");
				System.out.println ("You have still " + player.playerHealPots + " Healpots left");
			}

			else {
				System.out.println("invalid command");
			}

		}

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
