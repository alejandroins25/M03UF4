package Ex14;

import java.util.Arrays;
import java.util.Scanner;

public class Convert2String {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		String[] strVect = new String[10];
		int[] intVect = llegirVect(10);

		convertirString(intVect, strVect);

		System.out.println(Arrays.toString(strVect));

	}

	private static void convertirString(int[] intVect, String[] strVect) {

		for (int i = 0; i < strVect.length; i++) {
			strVect[i] = String.valueOf(intVect[i]);
		}

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
