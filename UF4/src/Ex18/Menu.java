package Ex18;

import java.util.Scanner;

public class Menu {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String text = llegirString();

		int opciones = 0;

		while (opciones != 4) {

			System.out.println("Escull una opció: ");
			System.out.println("1. Mostrar la longitud del text");
			System.out.println("2. Entrar un altre text i indicar si són iguals");
			System.out.println("3. Entrar dos enters (inici i fi) i mostrar el tros del text corresponent");
			System.out.println("4. Sortir");

			opciones = sc.nextInt();

			switch (opciones) {
			case 1:
				stringLong(text);
				break;
			case 2:
				System.out.print("Introdueix un altre ");
				sc.nextLine();
				String text2 = llegirString();
				compareStrings(text, text2);
				break;
			case 3:
				System.out.println("Introdueix un enter:");

				int start = llegirEnter();
				int fin = llegirEnter();

				textEntreInt(text, start, fin);
				break;
			case 4:
				opciones = 4;
				break;
			default:
				break;
			}
		}

	}

	private static void stringLong(String text) {
		System.out.println("La longitud del text és: " + text.length());
	}

	private static void compareStrings(String text, String text2) {
		if (text.equals(text2)) {
			System.out.println("Els 2 texts son iguals");
		} else {
			System.out.println("Els 2 texts son diferents");
		}

	}

	private static void textEntreInt(String text, int start, int fin) {

		if (start < 0 || fin > text.length() || start > fin) {
			System.out.println("Els índexs no són vàlids.");
		} else {
			System.out.println("El text a mostrar entre " + start + ", " + fin + " es :" + text.substring(start, fin));
		}

	}

	private static String llegirString() {
		do {
			System.out.println("Cadena : ");
			String readString = sc.nextLine();
			return readString;
		} while (true);
	}

	private static int llegirEnter() {
		do {
			try {
				int readInt = Integer.parseInt(sc.nextLine());
				return readInt;
			} catch (NumberFormatException e) {
			}
		} while (true);
	}

}
