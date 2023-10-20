package Ex11;

import java.util.Scanner;

public class Orden {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		int[] intVect = llegirVect(10);

		if (estaOrdenado(intVect)) {
			System.out.println("El vector esta ordenat");
		} else {
			System.out.println("El vector no esta ordenat");
		}

		sc.close();
	}

	private static boolean estaOrdenado(int[] intVect) {
		int ord = Integer.compare(intVect[0], intVect.length - 1);

		for (int i = 0; i < intVect.length - 1; i++) {
			int comp = Integer.compare(intVect[i], intVect[i + 1]);
			if (ord != 0) {
				if (comp == -ord) {
					return false;
				}
			} else {
				if (comp != 0) {
					return false;
				}
			}
		}
		return true;
	}

	private static int[] llegirVect(int tam) {
		System.out.println("Enter " + tam + " integers ");
		int[] ints = new int[tam];

		for (int i = 0; i < ints.length; i++) {
			ints[i] = llegirEnter(i + 1);
		}
		return ints;
	}

	private static int llegirEnter(int num) {
		do {
			try {
				System.out.println("Num " + num + " : ");
				int readInt = Integer.parseInt(sc.nextLine());
				return readInt;
			} catch (NumberFormatException e) {
				System.out.println("Please enter a number: ");
			}
		} while (true);
	}

}
