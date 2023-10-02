package cartes;

public abstract class Carte {
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	protected Carte(int nombre) {
		super();
		this.nombre = nombre;
	}

	private int nombre;
	
	public int getNombre() {
		return nombre;
	}
	
	@Override
	public String toString() {
		String s = "Carte [nombre=" + nombre + "]";
		
		return s;
	}

}
