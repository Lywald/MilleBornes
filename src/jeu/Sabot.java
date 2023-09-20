package jeu;

public class Sabot {
	int nbCartes;
	Carte[] cartes;
	
	public Sabot(int nbCartes) {
		// TODO Auto-generated constructor stub
		this.nbCartes = nbCartes;
	}

	boolean estVide() {
		return nbCartes == 0;
	}
}
