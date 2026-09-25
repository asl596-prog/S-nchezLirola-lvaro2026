package org.ip2027.tema01;

public class TiposPrimitivosReales {

	public static void main(String[] args) {
		// Transparencias Tema 01 - Bloque 02. 
		// Algunos ejemplos de uso de los tipos primitivos y String
		
		// 2. Números reales 
		float f1 = 5.0f;   // Los números con decimales escritos de forma literal son double por defecto
		float f2 = 19.5f;  // Hay que añadir 'f' al final del literal para convertirlo a float
		double d1 = 100.0, d2 = 1000000.0;
		float resultado;   
		
		resultado = f1 / f2;
		System.out.println("El resultado de " + f1 + " / " + f2 + " \t\t= " + resultado);
		System.out.printf("El resultado \"formateado\" de %.1f / %.1f = %.3f", f1, f2, resultado);
		System.out.println();
		
		f1 = Float.MIN_VALUE; // the smallest positive float, so it's very close to 0.
		f2 = Float.MAX_VALUE; // the biggest  positive float
		System.out.println("El float mínimo (positivo) es \t" + f1);
		System.out.println("El float máximo (positivo) es \t" + f2);
		// Distintos formatos con printf
		System.out.printf("En notación estándar: \t\t%,f\n", f2 );
		System.out.printf("En notación científica: \t%.18g\n", f2 );
		System.out.println();
		// doubles
		
		d1 = Double.MIN_VALUE; // the smallest positive double, so it's very very close to 0.
		d2 = Double.MAX_VALUE; // the biggest  positive double
		
		System.out.println("El double mínimo (positivo) es \t" + d1);
		System.out.println("El double máximo (positivo) es \t" + d2);
		
		// Desbordamiento con reales (distinto a lo que ocurre con enteros)
		
		d1 = d1 * 10;
		d2 = d2 * 10;
		
		System.out.println("El double mínimo * 10 es \t" + d1);
		System.out.println("El double máximo * 10 es \t" + d2);  // Infinito
		
		// Conversión de tipos: Castings
		
		int entero = (int) d1;
		System.out.println("La conversion de "+ d1 +" a entero es " + entero);
		entero = (int) d2;
		System.out.println("La conversion de "+ d2 +" a entero es " + entero);
		int i; 
		i = (int) 14.456; // Almacena 14 en la variable i
		System.out.println("El valor de convertir 14.456 a entero es " + i);
		i = (int) 14.956; // Sigue almacenando 14
		System.out.println("El valor de convertir 14.956 a entero es " + i);
		
		
	}

}
