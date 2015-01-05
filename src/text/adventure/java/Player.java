package text.adventure.java;

import java.util.Random;

public class Player {

	int playerHealth = 100;
	int playerAttack = 50;
	int playeDefence = 20;
	int playerHealPots = 3;
	int healPots = 30;
	int dropRate = 25; // Prozent
	int attack;
	int defence;
	
	public void player() {

		Random rand = new Random();
		int attack = rand.nextInt(this.playerAttack);
		int defence = rand.nextInt(this.playeDefence);

		
	}

	
}
