package Ex13;

import java.util.Arrays;
import java.util.Scanner;

public class LongChar {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		String[] strVect = llegirStrings(10);

		System.out.println("Se ha introducido el vector " + Arrays.toString(strVect));

		String cadenaMasLarga = cadenaMasLarga(strVect);
		System.out.println("La cadena más larga es \"" + cadenaMasLarga + "\" y mide " + cadenaMasLarga.length());

		sc.close();
	}

	private static String[] llegirStrings(int tam) {
		System.out.println("Enter " + tam + " integers ");
		String[] strings = new String[tam];

		for (int i = 0; i < strings.length; i++) {
			strings[i] = llegirString(i + 1);
		}
		return strings;
	}

	private static String llegirString(int num) {
		do {
			System.out.println("Cadena " + num + " : ");
			String readString = sc.nextLine();
			return readString;
		} while (true);
	}

	private static String cadenaMasLarga(String[] strVect) {
		String masLarga = strVect[0];
		for (int i = 1; i < strVect.length; i++) {
			if (strVect[i].length() > masLarga.length()) {
				masLarga = strVect[i];
			}
		}
		return masLarga;
	}
//	private static String longChar(String[] strVect) {
//		
//		String cadenalarga = strVect[0];
//		int longitud = cadenalarga.length();
//		
//		for (int i = 1; i < strVect.length; i++) {
//			if (strVect[i].length() > longitud) {
//				cadenalarga = strVect[i];
//				longitud = cadenalarga.length();
//			}
//		}
//		return cadenalarga ;
//	}

//	private static int[] llegirVect(int tam) {
//		System.out.println("Enter " + tam + " integers ");
//		int[] ints = new int[tam];
//
//		for (int i = 0; i < ints.length; i++) {
//			ints[i] = llegirChar(i + 1);
//		}
//		return ints;
//	}
//
//	private static String[] llegirChar(int num) {
//		do {
//			System.out.println("Cadena " + num + " : ");
//			Int llegirChar = sc.nextLine();
//			return llegirChar;
//		} while (true);
//	}

}