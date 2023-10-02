package cartes;

public abstract class Bataille extends Probleme {

	public Bataille(int nombre, Probleme.Type type) {
		super(nombre, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += " / Botte";
		return s;
	}
}
