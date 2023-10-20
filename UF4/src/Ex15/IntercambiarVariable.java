package Ex15;

public class IntercambiarVariable {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c[] = { a, b };

		System.out.println("Antes del intercambio: a = " + a + ", b = " + b);
		interValor(c);
		System.out.println("Despues del intercambio: a = " + c[0] + ", b = " + c[1]);
	}

	private static void interValor(int[] c) {
		int aux = c[1];
		c[1] = c[0];
		c[0] = aux;
	}
}