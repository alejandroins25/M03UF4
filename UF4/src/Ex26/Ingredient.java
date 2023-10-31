package Ex26;

public class Ingredient {
	private String nom;
	private double preu;
	private boolean esFruita;

	public Ingredient(String nom, double preu, boolean esFruita) {
		super();
		this.nom = nom;
		this.preu = preu;
		this.esFruita = esFruita;
	}

	@Override
	public String toString() {
		return nom + preu + esFruita;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}

	public boolean isEsFruita() {
		return esFruita;
	}

	public void setEsFruita(boolean esFruita) {
		this.esFruita = esFruita;
	}

}
