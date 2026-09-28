package org.ip2026.tema01;

/*************************************************************************
 * Muestra un entero pseudo-aleatorio entre 0 y N-1 Ilustra la onversion
 * explicita de tipos (cast) de double a int.
 * 
 *************************************************************************/

public class EnteroAleatorio {
	public static void main(String[] args) {
		int N = 10;

		// genera un real pseudo-aleatorio entre 0.0 y 1.0
		double r = Math.random();
		System.out.printf("El valor aleatorio es %7.3f", r);
		System.out.println();
		// lo convertirmos a un entero pseudo-aleatorio entre 0 y N-1
		int n = (int) (r * N);

		System.out.println("Su entero aleatorio es: " + n);

	}
}
