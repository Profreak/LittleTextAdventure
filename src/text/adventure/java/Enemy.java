package text.adventure.java;

import java.util.Random;

/**
 * 
 * This class represents an Enemy
 * 
 * @author A
 *
 */
public class Enemy {

	public final static int MAX_ENEMY_HEALTH = 50;
	public final static int MAX_ENEMY_ATTACK = 35;
	public final static int MAX_ENEMY_DEFENCE = 5;
	public final static int MIN_ENEMY_DEFENCE = 1;
	public final static int MIN_ENEMY_ATTACK = 1;
	

	public String[] enemies = { "Zombie", "Knight", "Mage" };
	private Random rand = new Random();
	public String enemy; 
	
	public Enemy() {

		enemy = enemies[rand.nextInt(enemies.length)];

	}

	public int enemyAttack() {
		int attack = rand.nextInt(MAX_ENEMY_ATTACK);
		if (attack < 1) {
			attack = 1;

		}
		return attack;
	}

	public int enemyHealth() {
		int health = rand.nextInt(MAX_ENEMY_HEALTH);
		if (health < 10) {
			health = 10;
		}
		return health;
	
	}
	

	public int enemyDefence() {
		int defence = rand.nextInt(MAX_ENEMY_DEFENCE);
		if (defence < 1) {
			defence = 0;
		}
		return defence;
	}
}