package org.ip2027.tema01;

public class Swap {

	public static void main(String[] args) {
		int x, y; 
		int temp;
		
		x=5; 
		y=100;
		
		System.out.println("Los valores de x e y son: ["+ x +"] [" + y +"]");
		
		// Swapping: intercambio de los valores de las variables x e y
		temp = x;
		x = y;
		y = temp; 
		
		System.out.println("Los valores de x e y tras el intercambio son: ["+ x +"] [" + y + "]");
		
	}
}
