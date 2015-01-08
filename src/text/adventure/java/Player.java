package text.adventure.java;

/**
 * 
 * This class represents the Player
 * 
 * @author Alexander Angeloussis
 *
 */
public class Player {

	public int playerHealth = 100;
	public int playerAttack = 50;
	public int playerDefence = 50;
	public int playerHealPots = 3;
	public int healPots = 30;
	public int dropRate = 25;

	public int attack;
	public int defence;

	public void player() {

		playerHealth = 100;
		playerAttack = 50;
		playerDefence = 50;
		playerHealPots = 3;
		healPots = 30;

	}

}
