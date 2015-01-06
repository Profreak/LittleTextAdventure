package text.adventure.java;

import java.util.Random;
import java.util.Scanner;

public class Enemy {

	public static final String[] ENEMIES = { "Mage", "Skeleton", "Demon",
			"Hellhound", "Barbarian", "Knight", "Zombie" };
	public final static int MIN_ENEMY_ATTACK = 5;
	public final static int MAX_ENEMY_ATTACK = 25;
	public final static int MAX_ENEMY_DEFENCE = 5;
	public final static int MAX_ENEMY_HEALTH = 60;
	public final static int MIN_ENEMY_HEALTH = 10;
	private int enemyHealth;
	private int enemyAttack;
	private int enemyDefence;
	private String enemy;

	public Enemy() {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		String enemy = ENEMIES[rand.nextInt(ENEMIES.length)];

		enemyHealth = MIN_ENEMY_HEALTH
				+ rand.nextInt(MAX_ENEMY_HEALTH - MIN_ENEMY_HEALTH);
		enemyAttack = MIN_ENEMY_ATTACK
				+ rand.nextInt(MAX_ENEMY_ATTACK - MIN_ENEMY_ATTACK);
		enemyDefence = rand.nextInt(MAX_ENEMY_DEFENCE);

	}
	
	
	

	public String getEnemy () {
	return enemy;	
	}


	/**
	 * @return the enemyHealth
	 */
	public int getEnemyHealth() {
		return enemyHealth;
	}

	/**
	 * @param enemyHealth
	 *            the enemyHealth to set
	 */
	public void setEnemyHealth(int enemyHealth) {
		this.enemyHealth = enemyHealth;
	}

	/**
	 * @return the enemyAttack
	 */
	public int getEnemyAttack() {
		return enemyAttack;
	}

	/**
	 * @param enemyAttack
	 *            the enemyAttack to set
	 */
	public void setEnemyAttack(int enemyAttack) {
		this.enemyAttack = enemyAttack;
	}

	/**
	 * @return the enemyDefence
	 */
	public int getEnemyDefence() {
		return enemyDefence;
	}

	/**
	 * @param enemyDefence
	 *            the enemyDefence to set
	 */
	public void setEnemyDefence(int enemyDefence) {
		this.enemyDefence = enemyDefence;
	}

	/**
	 * Returns true if enemy is alive
	 * 
	 * @return true if enemy is alive
	 */
	public boolean isAlive() {

		return (enemyHealth > 0);
	}




	
		
	}


