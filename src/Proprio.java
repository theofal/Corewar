package gui;

import core.*;

//Cette classe attribue le numéro du joueur à chaque case dans laquelle la dernière modification a été effectuée
//Elle transforme aussi le core en un tableau à 2 dimensions

public class Proprio {

	public int [][] tableColoriee = new int [64][64];
	
public Proprio(){
	
	initTable();

	//coreToGrille(proprio(Core.lastAddress, Core.lastPlayer));
	
}
	
	public void coreToGrille(int [] grilleColoriee) {

		int c = 0;
		
		for(int i=0; i<grilleColoriee.length; i++) {
			if(i%63 == 0) {
				tableColoriee[c][i] = grilleColoriee[i];
				c++;
			}
			else if (i%63 != 0) {
				tableColoriee[c][i] = grilleColoriee[i];
			}

		}
		
	}
	
	private void initTable() {
		for(int i=0; i<tableColoriee[i].length; i++) {
			for(int j=0; j<tableColoriee[j].length; j++) {
				tableColoriee[i][j] = 0;
			}
		}
	}
	
	//Les variables lastAddress et lastPlayer ne sont pas encore initialisées.
	//lastAddress correspond à la dernière adresse où une modification a été effectuée
	//lastPlayer correspond au renier joueur a avoir joué (1 ou 2)
	private int [] proprio(int lastAddress, int lastPlayer){
		int [] grilleColoriee = new int [4096];
		grilleColoriee[lastAddress] = lastPlayer;
		return grilleColoriee;
	}
	
}
