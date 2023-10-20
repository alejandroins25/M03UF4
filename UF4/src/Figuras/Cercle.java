package Figuras;

public class Cercle extends Figuras {
	private int radi;
	private Punt centre;

	public Cercle(int radi, Punt centre) {
		super();
		nom = "cercle";
		this.radi = radi;
		this.centre = centre;
	}

	@Override
	public double calcularPerimetre() {
		return 2 * Math.PI * radi;
	}

	@Override
	public String toString() {
		return nom + " [radi=" + radi + ", centre= " + centre + "]";
	}
}