package Ex10;

import java.util.Arrays;
import java.util.Scanner;

public class HasRepeated {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		// Llegir un vector de 10 enters
		int[] intVect = llegirVect(10);

		// Si algun valor es repeteix o no (busca)
		System.out
				.println(" El vector " + Arrays.toString(intVect) + isAnyRepeated(intVect) + " te elements repetits ");

		sc.close();
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

	private static boolean isAnyRepeated(int[] vec) {
		for (int i = 0; i < vec.length - 1; i++) {
			for (int j = i + 1; j < vec.length; j++) {
				if (vec[i] == vec[j]) {
					return true;
				}
			}
		}
		return false;
	}

}
