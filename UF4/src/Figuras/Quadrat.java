package Figuras;

public class Quadrat extends Figuras {
	private int costat;

	public Quadrat(int costat) {
		super();
		nom = "quadrat";
		this.costat = costat;
	}

	@Override
	public double calcularPerimetre() {
		return 4 * costat;
	}

	@Override
	public String toString() {
		return nom + " [radi=" + costat + "]";
	}

}
