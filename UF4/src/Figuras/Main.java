package Figuras;

public class Main {

	public static void main(String[] args) {
		Figuras[] figura = new Figuras[] { new Cercle(10, new Punt(5, 5)), new Quadrat(5), new Quadrat(8),
				new Cercle(8, new Punt(5, 5)) };

		for (Figuras figuras : figura) {
			System.out.println("El perimetre del " + figuras + " és " + figuras.calcularPerimetre());
		}
	}

}
