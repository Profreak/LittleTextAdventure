package text.adventure.java;

public class Enemy {

	public static final String [] enemiesClass = {"Warrior", "Zombie","Dark Mage","Hellhound", "Hello Kitty","Old Granpa" };

	
	int health;
	int attack;
	int defence;
	int dropRate;
	String klasse;
	
// f�r jede Klasse wird nun ein Wert eingegeben,
	
	
	
	// Methode, welche aufgerufen wird, wenn ich den new Befehl ausf�hren => ist der Konstruktur => der Typ der das baut.
	// Vorher existiert nur der Bauplan, wie bei einer Miniatur. Erst durch die Ausf�hrung new Enemy wird diese Miniatur gegossen.
	
	public Enemy (int enemyId) {
		
		klasse = enemiesClass [enemyId];
System.out.println (klasse);
	}

	
	
	
}


