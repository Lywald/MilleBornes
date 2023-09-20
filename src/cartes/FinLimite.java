
public class FinLimite extends Limite {

	public FinLimite(int nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += " / FinLimite";
		return s;
	}
}
