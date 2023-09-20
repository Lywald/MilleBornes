
public class Attaque extends Bataille {

	public Attaque(int nombre, Probleme.Type type) {
		super(nombre, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += " / Attaque";
		return s;
	}
}
