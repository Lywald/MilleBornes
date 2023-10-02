package cartes;

public class Parade extends Bataille {

	public Parade(int nombre, Probleme.Type type) {
		super(nombre, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += " / Parade";
		return s;
	}
}
