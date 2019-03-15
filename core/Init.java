package core;



// Cette classe correspond à l'initialisation de chaque guerrier dans le core

public class Init {

	public static int initJ1 = randInt(0,4095); //initialisation du J1 dans la grille 
	public static int initJ2 = randInt(0,4095); //initialisation du J2 dans la grille 

public void init() {


	}

public static boolean ecartJoueurs() {

boolean test = false;

while(test = false) {
	if(initJ1 - initJ2 <= 192 || initJ2 - initJ1 <= 192) {
		initJ1 = randInt(0,4095);
		initJ2 = randInt(0,4095);
		
		test = false;
	}
	else test = true;

}
return test;
}

public static int randInt(int min, int max) {
return min + (int)(Math.random() * ((max - min) + 1));
}
}
