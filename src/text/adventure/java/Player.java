package text.adventure.java;

/**
 * 
 * This class represents the Player
 * 
 * @author Alexander Angeloussis
 *
 */
public class Player {

	public int playerHealth;
	public int playerAttack;
	public int playerDefence;
	public int playerHealPots;
	public int healPots ;
	public int dropRate;

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
