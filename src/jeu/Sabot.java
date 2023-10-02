package jeu;

import java.util.Iterator;

import cartes.Attaque;
import cartes.Borne;
import cartes.Botte;
import cartes.Carte;
import cartes.Parade;
import cartes.Probleme;

public class Sabot implements Iterable<Carte>{
	public int nbCartes;
	Carte[] cartes;
	
	
	
	public Sabot(int nbCartes) {
		// TODO Auto-generated constructor stub
		this.nbCartes = nbCartes;
		this.cartes = new Carte[110];
		
		/*
		Carte cTest = new Botte(1, Probleme.Type.ESSENCE);
		
		try {
			ajouterCarte(cTest);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	boolean estVide() {
		return nbCartes == 0;
	}
	
	private void ajouterCarte(Carte c) throws Exception {
		if (nbCartes == 110) throw new Exception("err");
		cartes[nbCartes++] = c;
		System.out.println("ajout simple de carte");
	}
	
	public void ajouterFamilleCarte(Carte...cs) {
		for(Carte cc : cs) {
			try {
				ajouterCarte(cc);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	void ajouterFamilleCarte(Carte c) {
		int nbAjouts = 0;
		
		if (c.getClass().isAssignableFrom(Botte.class)) {
			nbAjouts = 1;
		} else if (c.getClass().isAssignableFrom(Attaque.class)) {
			Attaque atk = (Attaque) c;
			
			if (((Probleme) c).type == Probleme.Type.ACCIDENT) {
				nbAjouts = 3;
			} else if (((Probleme) c).type == Probleme.Type.ESSENCE) {
				nbAjouts = 3;
			} else if (((Probleme) c).type == Probleme.Type.FEU) {
				nbAjouts = 5;
			} else {
				nbAjouts = 3;
			}
		} else if (c.getClass().isAssignableFrom(Parade.class)) {
			Parade par = (Parade) c;
			
			if (((Parade) c).type == Parade.Type.FEU) {
				nbAjouts = 14;
			} else if (((Parade) c).type == Parade.Type.ESSENCE) {
				nbAjouts = 6;
			} else if (((Parade) c).type == Parade.Type.CREVAISON) {
				nbAjouts = 6;
			} else {
				nbAjouts = 6;
			}
		} else if (c.getClass().isAssignableFrom(Borne.class)) {
			//Borne bor = (Borne) c;
			
			if ((c).getNombre() == 25) {
				nbAjouts = 10;
			} else if ((c).getNombre() == 50) {
				nbAjouts = 10;
			} else if ((c).getNombre() == 75) {
				nbAjouts = 10;
			} else if ((c).getNombre() == 100) {
				nbAjouts = 12;
			} else {
				nbAjouts = 4;
			}
		} else {nbAjouts = 4;} 
			 
		
		for(int i = 0; i < nbAjouts; i++) {
			try {
				ajouterCarte(c);
				System.out.println("ajout de carte c:" + c.toString());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public Carte piocher() {
		if (nbCartes == 0) return null;
		Iterateur it = new Iterateur();
		Carte res = it.next();
		System.out.println("piochage de: " + res.toString());
		
		it.remove();
		return res;
	}
	
	 private class Iterateur implements Iterator<Carte> {
		 private int indiceIterateur = 0;
		 private boolean nextEffectue = false;
		 public boolean hasNext() { 
			 return (indiceIterateur < nbCartes);
			 
		 }
		 public Carte next() { 
			 System.out.println(cartes[indiceIterateur].toString());
			 Carte nextCarte = cartes[indiceIterateur++];
			 nextEffectue = true;
			 return nextCarte;
		 }
		 public void remove() {
			 if (nbCartes < 1 || !nextEffectue) throw new IllegalStateException();
			 
			 System.out.println("suppression de carte c: " + cartes[indiceIterateur].toString());
			 for (int i = indiceIterateur; i < nbCartes - 1; i++) {
				  cartes[i] = cartes[i+1];
			 }
			 //indiceIterateur--;
			 nbCartes--;
			 nextEffectue = false;
		 }
	 }

	
	@Override
	public Iterator<Carte> iterator() {
		// TODO Auto-generated method stub
		
		return new Iterateur();
	}
}
