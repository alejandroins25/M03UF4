package Ex26;

import org.apache.commons.lang3.StringUtils;

public class Plato {

	private static final int col_num = 3;
	private static final int col_nom = 20;
	private static final int col_preu = 16;
	private static final int col_equi = 7;
	private static final int col_tot = col_num + col_nom + col_preu + col_equi;
	private String nom;
	private double preu;
	private Ingredient[] ingredients;

	public Plato(String nom, Ingredient[] ingredients) {
		super();
		this.setNom(nom);
		this.ingredients = ingredients;
		preu = calcularPreu();

	}

	@Override
	public String toString() {
		String stringPlato = stringTitulo() + stringIngredients() + cabeceraIngredients() + ingredients();
		return stringPlato;
	}

	protected String stringTitulo() {
		String spreu = String.format("%.2f", preu);
		return nom + ", Preu: " + spreu + "€" + System.lineSeparator();
	}

	private String stringIngredients() {
		return "Ingredients: " + System.lineSeparator();
	}

	protected String cabeceraIngredients() {
		String cabeceraIngredients = "";
		cabeceraIngredients += StringUtils.repeat("-", col_tot);
		cabeceraIngredients += System.lineSeparator();
		cabeceraIngredients += StringUtils.rightPad("#", col_num);
		cabeceraIngredients += StringUtils.rightPad("Nom", col_nom);
		cabeceraIngredients += StringUtils.rightPad("Preu", col_preu);
		cabeceraIngredients += StringUtils.rightPad("Fruita", col_preu);
		cabeceraIngredients += System.lineSeparator();
//		return "# " + " Nom " + " Preu " + " Fruita " + System.lineSeparator() + StringUtils.repeat("-", 30)
//				+ System.lineSeparator();
		return cabeceraIngredients;
	}

	protected String ingredients() {
		String stringIngredients = "";

		int acum = 0;
		for (Ingredient ingredient : ingredients) {
			acum += 1;
			// stringIngredients += Integer.toString(acum) + "- " + ingredient +
			// System.lineSeparator();
			String spreu = String.format("%.2f", ingredient.getPreu());
			String sfruta = "";
			if (ingredient.isEsFruita()) {
				sfruta = "Si";
			} else {
				sfruta = "No";
			}

			stringIngredients += StringUtils.rightPad(Integer.toString(acum) + "-", col_num);
			stringIngredients += StringUtils.rightPad(ingredient.getNom(), col_nom);
			stringIngredients += StringUtils.rightPad(spreu + "€", col_preu);
			stringIngredients += StringUtils.rightPad(sfruta, col_preu);
			stringIngredients += System.lineSeparator();

		}
		return stringIngredients;
	}

	private double calcularPreu() {
		for (Ingredient ingredient : ingredients) {
			preu += ingredient.getPreu();
		}
		return preu;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

//	private static void imprimirLlista(Plato plato) {
//		System.out.println(plato.getNom() + ", Preu: " + plato.getPreu() + "€");
//		System.out.println("Ingredients: ");
//		System.out.println("# Nom  Preu  Fruita");
//		System.out.println();
//		for (Ingredient ingredient : ingredients) {
//
//		}
//	}

}
