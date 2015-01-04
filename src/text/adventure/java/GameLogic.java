package text.adventure.java;

import java.util.Scanner;

public class GameLogic {

	public void GameLogic() {

		Enemy enemy = new Enemy();
		enemy.Enemy();

		Player player = new Player();
		player.player();

		enemy.getClass();

		System.out.println("Welcom to the Dungeon!");

		// pausiert das Spiel um 1 Sekunde! Ist in double ... Es sind also auch 0.5 sekunden moeglich
		// bsp: pause(0.5);
		pause(1);
		
		Scanner sc = new Scanner(System.in);
		boolean running = true;
		while (running) {
			System.out.print("Eingabe: ");
			String action = sc.next();


			System.out.println("#-----------------------------#");

			System.out.println("\t1. Go further down into the Dungeon!");
			System.out.println("\t2. Search this area");
			System.out.println("\t3. Leave the Dungeon");
			System.out.println("\t4. Heal");

			if (action.equals(1)) {
				System.out.println("An" + "" + enemy + "appeared");

				System.out.println(" What will you do?");
				System.out.println("\t1. Attack!");
				System.out.println("\t2. Defence");
				System.out.println("\t3. Run!");
				System.out.println("\t4. Heal");

				while (enemy.isAlive()) {
					if (action.equals("1")) {
						System.out.println("You swing your mighty sword! ");
						int damageDone = enemy.getEnemyHealth()
								- player.playerAttack;
						int damageTaken = player.playerHealth
								- enemy.getEnemyHealth();
						System.out.println("You deal " + player.playerAttack
								+ " damage");
						System.out.println(" You take "
								+ enemy.getEnemyHealth());

						/**
						 * Hi Ludi, bräuchte deine Hilfe bzgl. der Übertragung
						 * von enemyHealth ^^
						 */
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
				player.playerHealth = player.playerHealth + player.healPots;
				System.out.println("You drink a heal pot");
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
			Thread.sleep((int)(n * 1000));
		} catch (InterruptedException error) {
			error.printStackTrace();
		}
		
	}

}
