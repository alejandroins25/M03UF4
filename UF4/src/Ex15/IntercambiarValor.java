package Ex15;

public class IntercambiarValor {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;

		System.out.println("Antes del intercambio: a = " + a + ", b = " + b);
		interValor(a, b);
		System.out.println("Despues del intercambio: a = " + a + ", b = " + b);
	}

	private static void interValor(int a, int b) {

		int temp = a;
		b = a;
		a = temp;

	}
	// No se intercambian los valores porque los estas cambiando en la funcion lo
	// que cambian es el valor pero no la referencia, para cambiarlo bien seria asi:

}
