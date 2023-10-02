package cartes;

public abstract class Limite extends Carte {

	public Limite(int nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += " / Limite";
		return s;
	}
}
