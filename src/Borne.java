
public class Borne extends Carte {
	int km;
	
	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public Borne(int nombre, int km) {
		super(nombre);
		// TODO Auto-generated constructor stub
		setKm(km);
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s += " / km = " + getKm();
		s += " / Borne";
		return s;
	}

}
