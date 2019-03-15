package core;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import gui.*;


//CLASSE A MODIFIER !!!

public class Core{

	public int [] core = new int [4096]; //tableau du core
	private static final long serialVersionUID = 1L;
	
	private static int cyclesDone = 0;
	private int lastAddress = 0;
	private int lastPlayer = 0;
	public int placementIJ1 = Init.initJ1; //placement dans la grille du J1 dans le Core 
	public int placementIJ2 = Init.initJ2; //placement dans la grille du J2 dans le Core
	private static String instructionJoueur; //dernière instruction scannée - requis pour la classe AffichageData
	//public static Thread t;
	
public Core() throws FileNotFoundException{
	
	//Threads à faire
	
	//Scan(UI.file1);
	//nextMove();
	//revalidate(?) + updateGrid();
	}

	

//Cette methode permet de lire un fichier texte
private static String Scan(File f) throws FileNotFoundException{
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(f);
	String ligne1 = sc.nextLine();
	instructionJoueur = ligne1;
	return ligne1;
}


// Cette methode permet de regler le delay (JSlider) - A TERMINER
//Il faudra mettre des threads.
//int delay correspond aux differents delays qui seront disponibles - ex : JSlider 0 = 10ms, JSlider 50 = 5ms, JSlider 100 = 1ms
public static void run(int delay) {
	for(int i=0; i<20; i++) {

      try {
         // delay de x millisecondes
         Thread.sleep(delay);
      } catch (Exception e) {
         System.out.println(e);
      }
	}
   }

public static int getCyclesDone()
{
  return cyclesDone;
}        
}
