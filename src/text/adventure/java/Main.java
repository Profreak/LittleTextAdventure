/**
 * 
 */
package text.adventure.java;

import java.util.Random;

/**
 * @author Raptor
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random ();
		Enemy enemy = new Enemy (rand.nextInt(Enemy.enemiesClass.length));
		Enemy enemy1 = new Enemy (0);
	}

}
