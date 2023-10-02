package cartes;

public abstract class Probleme extends Carte {

	public enum Type {
		FEU, ESSENCE, CREVAISON, ACCIDENT
	}
	
	public Type type;

	public Probleme(int nombre, Type type) {
		super(nombre);
		this.type = type;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += " / type: " + type.toString();
		s += " / Probleme";
		return s;
	}
}
