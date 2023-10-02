package testsFonctionnels;
import java.util.Iterator;

import cartes.Attaque;
import cartes.Botte;
import cartes.Carte;
import cartes.Parade;
import cartes.Probleme;
import jeu.Sabot;


public class testsClasse {
	Sabot s;
	
	public testsClasse() {
		s = new Sabot(0);
		s.ajouterFamilleCarte(new Attaque(1, Probleme.Type.ACCIDENT));
		s.ajouterFamilleCarte(new Parade(1, Probleme.Type.ACCIDENT));
		s.ajouterFamilleCarte(new Botte(1, Probleme.Type.ACCIDENT));
		
		//a.
		
		int nbAPiocher = s.nbCartes;
		for (int i = 0; i < nbAPiocher; i++) {
			s.piocher();
		}
		
		
		//b.

		s.ajouterFamilleCarte(new Attaque(1, Probleme.Type.ACCIDENT));
		s.ajouterFamilleCarte(new Parade(1, Probleme.Type.ACCIDENT));
		s.ajouterFamilleCarte(new Botte(1, Probleme.Type.ACCIDENT));
		
		Iterator<Carte> it = s.iterator();
		
		/*for(Iterator<Carte> it = s.iterator(); it.hasNext(); it.next()) {
			System.out.println("removing carte");
			it.remove();
		}*/
		
		do {				
			it.next();
			it.remove();
			System.out.println("Suppression d'une carte");
		} while(it.hasNext());
		
		System.out.println("Tests finis");
	}

	
	public static void main(String[] args) {
		testsClasse tests = new testsClasse();

	}
}
