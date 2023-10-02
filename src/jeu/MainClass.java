package jeu;

import cartes.Attaque;
import cartes.Botte;
import cartes.Carte;
import cartes.Probleme;

public class MainClass {

	Sabot s = new Sabot(0);
	
	public MainClass() {		
		
		s.ajouterFamilleCarte(new Attaque(1, Probleme.Type.FEU));
		
		for(Carte cs : s) {
			cs.toString();
		}
		
		s.ajouterFamilleCarte(new Botte(1, Probleme.Type.CREVAISON));
		//System.out.println(s.iterator().next());
		
		s.piocher();
	}
	

	public static void main(String[] args) {
//		MainClass m = new MainClass();
	}
}

