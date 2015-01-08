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

	// possible enemy classes
	public static final String[] ENEMIES = { "Mage", "Skeleton", "Demon", "Hellhound", "Barbarian", "Knight", "Zombie" };
	
	// constante Rahmenbediengungen deiner Enemys
	public final static int MIN_ENEMY_ATTACK = 5;
	public final static int MAX_ENEMY_ATTACK = 25;
	public final static int MAX_ENEMY_DEFENCE = 5;
	public final static int MAX_ENEMY_HEALTH = 60;
	public final static int MIN_ENEMY_HEALTH = 10;
	
	// Klassen variabeln
	private int enemyHealth;
	private int enemyAttack;
	private int enemyDefence;
	private String enemy;

	/**
	 * create an new enemy
	 */
	public Enemy() {

		Random rand = new Random();

		this.enemy = ENEMIES[rand.nextInt(ENEMIES.length)];

		this.enemyHealth = MIN_ENEMY_HEALTH + rand.nextInt(MAX_ENEMY_HEALTH - MIN_ENEMY_HEALTH);
		this.enemyAttack = MIN_ENEMY_ATTACK + rand.nextInt(MAX_ENEMY_ATTACK - MIN_ENEMY_ATTACK);
		this.enemyDefence = rand.nextInt(MAX_ENEMY_DEFENCE);

	}

	/**
	 * returns the Enemy Class
	 * 
	 * @return
	 */
	public String getEnemyClass() {
		return this.enemy;
	}

	/**
	 * @return the enemyHealth
	 */
	public int getEnemyHealth() {
		return this.enemyHealth;
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
