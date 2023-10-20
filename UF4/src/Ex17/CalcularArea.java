package Ex17;

import java.util.Scanner;

public class CalcularArea {

	public static void main(String[] args) {

		double radi = llegirEnter();

		double area = Math.PI * radi * radi;
		System.out.println("El area del circulo con radio " + radi + " es: " + area);

	}

	private static double llegirEnter() {
		double radi = 0.0;
		boolean inputValid = false;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println("Introdueix el radi: ");
				radi = sc.nextDouble();
				inputValid = true;
			} catch (Exception e) {
				System.out.println("Error en la entrada. Inténtalo de nuevo");
				sc.nextLine();
			}
		} while (!inputValid);
		sc.close();
		return radi;
	}
}
