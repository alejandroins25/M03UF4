package Ex26;

public class Postre extends Plato {

	private boolean necesitaHorno;

	public Postre(String nom, Ingredient[] ingredients, boolean necesitaHorno) {
		super(nom, ingredients);
		this.necesitaHorno = necesitaHorno;
	}

	public boolean isHorno() {
		return necesitaHorno;
	}

	public void setHorno(boolean horno) {
		this.necesitaHorno = horno;
	}

	@Override
	public String toString() {
		String stringPlato = stringTitulo() + forn() + cabeceraIngredients() + ingredients();
		return stringPlato;
	}

	@Override
	protected String stringTitulo() {
		return "Postre: " + super.stringTitulo();
	}

	private String forn() {
		if (necesitaHorno) {
			return "Requiere horno" + System.lineSeparator();
		} else {
			return "No requiere horno" + System.lineSeparator();
		}

	}

}
