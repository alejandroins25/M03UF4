package Ex26;

public class Llista {
	public static void main(String[] args) {
		Ingredient[] ingredientsPl = new Ingredient[3];
		ingredientsPl[0] = new Ingredient("Patata", 3.50, true);
		ingredientsPl[1] = new Ingredient("Cebolla", 2.80, true);
		ingredientsPl[2] = new Ingredient("Huevo", 2.10, true);

		Plato plato = new Plato("Tortilla de patata", ingredientsPl);

		Ingredient[] ingredientsPo = new Ingredient[3];
		ingredientsPo[0] = new Ingredient("Arroz", 2.10, true);
		ingredientsPo[1] = new Ingredient("Leche", 1.40, true);
		ingredientsPo[2] = new Ingredient("Canela", 0.50, false);

		Postre postre = new Postre("Arroz con leche", ingredientsPo, false);

		System.out.println(plato);
		System.out.println(postre);

//		String[] ingredientesPl = { "Patata", "Cebolla", "Huevo" };
//		Double[] preuIngPl = { 3.5, 2.80, 2.10 };
//		Boolean[] fruta = { true, true, true };
//
//		String[] ingredientesPo = { "Arroz", "Leche", "Canela" };
//		Double[] preuIngPo = { 2.10, 1.40, 0.50 };
//		Boolean[] fruta = { false, true, false };

//		imprimirLlista("Primer plato", "Tortilla de patata", 8.40, ingredientesPl, preuIngPl, organicoPl);
	}

}
