package Ex12;

import java.util.Scanner;

public class CountPares {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		int[] intVect = llegirVect(10);

		int parImpar[] = parImpar(intVect);

		System.out.println("El vector te " + parImpar[0] + " numeros parells i " + parImpar[1] + " senars ");

		sc.close();
	}

	private static int[] parImpar(int[] intVect) {
		int[] parImpar = new int[2];

		for (int i = 0; i < intVect.length; i++) {
			parImpar[intVect[i] % 2]++;

//			if (intVect[i] % 2 == 0) {
//				parImpar[0]++;
//			} else {
//				parImpar[1]++;
//			}
		}
		return parImpar;
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