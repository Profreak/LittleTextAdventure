package text.adventure.java;

import java.util.Scanner;


public class Ausf�hrung {

Scanner sc;
String eingabe;
String eingabe1;
	


public Ausf�hrung (){

sc = new Scanner (System.in);
}

public void begr��ung  () {
	System.out.println ("Hallo lieber Nutzer");
	System.out.println ("Bitte t�tigen Sie eine Eingabe");
	System.out.println ("==>");
	this.eingabe1();
	
}

public void eingabe1 () {
	this.eingabe = sc.next ();
	int zahl1 = Integer.parseInt((eingabe));
	
}

public void eingabe () {
	
}

public void eingabe2 () {
	this.eingabe1 = sc.next();
	int zahl2 = Integer.parseInt(eingabe1);
	
	
}


}