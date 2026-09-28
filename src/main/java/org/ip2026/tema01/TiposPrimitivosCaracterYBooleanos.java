package org.ip2026.tema01;

public class TiposPrimitivosCaracterYBooleanos {

	public static void main(String[] args) {
		// Transparencias Tema 01 - Bloque 02. 
		// Algunos ejemplos de uso de los tipos primitivos y String
		
		// 3. Caracter 
		char c1 = 'a';
		char c2 = 'A';
		
		System.out.println("Caracter c1: " + c1);
		System.out.println("Caracter c2: " + c2);
		
		c1 = (char) (c1 + 3);   	
		c2 = (char) (c2 + 20);
		
		System.out.println("Caracter c1: " + c1);
		System.out.println("Caracter c2: " + c2);
		
		// caracteres Unicode. Link: https://unicodeplus.com/
		char caracterPi= '\u03C0';  // Greek Small Letter Pi (U+03C0)
		char caracterSigma = '\u03A3';   // Greek Capital Letter Sigma (U+03A3)

		System.out.println("Greek Small Letter Pi (U+03C0): " + caracterPi);
		System.out.println("Greek Capital Letter Sigma (U+03A3): " + caracterSigma);
		
		// Boolean
		System.out.println();
		System.out.println("Ejemplos con valores booleanos");
		System.out.println("--------------------------------");
		boolean sonIguales, sonDistintos;
		sonIguales   = (c1 == c2);
		sonDistintos = (c1 != c2);
		System.out.println("Los caracteres " + c1 + " y " + c2 + " son iguales?: " + sonIguales);
		System.out.println("Los caracteres " + c1 + " y " + c2 + " son distintos?: " + sonDistintos);
		
		System.out.println("Los caracteres " + 'a' + " y " + 'a' + " son iguales?: " + ('a'=='a'));
		System.out.println("Los caracteres " + 'z' + " y " + 'q' + " son iguales?: " + ('z'=='q'));
	} 

}
