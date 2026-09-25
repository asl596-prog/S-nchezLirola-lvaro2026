package org.ip2027.tema01;

public class TiposPrimitivosEnteros {

	public static void main(String[] args) {
		// Transparencias Tema 01 - Bloque 02. 
		// Algunos ejemplos de uso de los tipos primitivos y String
		
		// 1. Números enteros
		int enteroMinimo = 0, enteroMaximo = 100;
		
		System.out.println("Algunos ejemplos con variables int: ");
		System.out.println("--------------------------------------------------");
		System.out.println("Las variables de tipo int enteroMinimo y enteroMaximo se han inicializado a "
				+ enteroMinimo + " y " + enteroMaximo + ", respectivamente");
		
		// Asigno los valores enteros mínimo y máximo respectivamente, usando las constantes predefinidas
		enteroMinimo = Integer.MIN_VALUE;	// -2147483648
		enteroMaximo = Integer.MAX_VALUE;   // 2147483647
		
		System.out.println("El valor mínimo que se puede almacenar en una variable tipo int es: " + enteroMinimo);
		System.out.println("El valor máximo que se puede almacenar en una variable tipo int es: " + enteroMaximo);

		// enteros largos
		
		long enteroLargo1 = 0;
		long enteroLargo2 = enteroLargo1;

		System.out.println("\nAlgunos ejemplos con variables long: ");
		System.out.println("--------------------------------------------------");
		
		System.out.println("Las variables de tipo long enteroLargo1 y enteroLargo2 se han inicializado a "
				+ enteroLargo1 + " y " + enteroLargo2 + ", respectivamente");
		
		enteroLargo1 = Long.MIN_VALUE;
		enteroLargo2 = Long.MAX_VALUE;
		
		System.out.println("El valor mínimo que se puede almacenar en una variable tipo long es: " + enteroLargo1);
		System.out.println("El valor máximo que se puede almacenar en una variable tipo long es: " + enteroLargo2);

		// Desbordamiento: Los rangos en Java funcionan de forma circular
		System.out.println("\nDesbordamiento: Los rangos en Java funcionan de forma circular:");
		enteroMinimo = enteroMinimo - 1;
		System.out.println("El resultado de restar 1 al mínimo es = " + enteroMinimo);
		enteroMaximo = enteroMaximo + 1; 
		System.out.println("El resultado de sumar  1 al máximo es = " + enteroMaximo);
		
		// Algunas expresiones aritméticas
		int x=25, y=3;
		int resultado; 
		resultado = (3+4*x)/5 - 10*(y-5)*(3+5+9)/x + 9*(4/x) + (9+x)/y;
		System.out.println("\nEl resultado de la expresión aritmética es = " +  resultado);
		System.out.println();
		System.out.println("La division " + x + "/" + y + " = " + 	x/y);
		System.out.println("El módulo   " + x + "%" + y + " = " + x%y);
		
		
		// Conversión de tipos
		
		enteroLargo1 = x;        // De int a long no es necesario casting
		System.out.println();
		System.out.println("Variable int x = " + x);
		System.out.println("Variable long enteroLargo1 = " + enteroLargo1 );
		
		y = (int) enteroLargo2;  // De long a int, el casting es obligatorio!!!
		System.out.println("variable int y = "  + y );
		System.out.println("variable long enteroLargo2 = " + enteroLargo2);
		
		// Operadores incremento y decremento. Operadores unarios
		System.out.println();
		
		System.out.println("Incremento y decremento de una variable x:");
		System.out.println("x = " + x);
		x = x + 1;  // incremento en 1`
		System.out.println("x = x + 1;\nx = " + x);
		x = x - 1;  // decremento en 1
		System.out.println("x = x - 1;\nx = " + x);
		
		System.out.println("Operadores unarios de incremento y decremento:");
		System.out.println("x = " + x);
		System.out.println("++x = " + ++x);  // pre-incremento
		System.out.println("x++ = " + x++);  // post-incremento
		System.out.println("x = " + x);
		System.out.println("--x = " + --x);  // pre-decremento
		System.out.println("x-- = " + x--);  // post-decremento
		System.out.println("x = " + x);
		
		// Operadores combinados de asignación y operación
		System.out.println();
		System.out.println("Operadores combinados de asignación y operación:");
		System.out.println("x = " + x);
		x += 5;  // equivalente a x = x + 5
		System.out.println("x += 5;\nx = " + x);
		x -= 5;  // equivalente a x = x - 5
		System.out.println("x -= 5;\nx = " + x);
		x *= 2;  // equivalente a x = x * 2
		System.out.println("x *= 2;\nx = " + x);
		x /= 4;  // equivalente a x = x / 4
		System.out.println("x /= 4;\nx = " + x);
		x %= 5;  // equivalente a x = x % 5
		System.out.println("x %= 5;\nx = " + x);
		
	}
}
