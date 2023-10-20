package Ex09;

public class SumaVector {

	public static void main(String[] args) {

		int[] valors = { 7, 9, 2 };

		int sum = 0;
		for (int i = 0; i < valors.length; i++) {
			sum += valors[i];
		}

		System.out.println("La suma del vector es \t" + sum);

	}

};
