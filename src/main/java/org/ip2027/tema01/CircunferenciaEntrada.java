package org.ip2027.tema01;

import java.util.Scanner;

public class CircunferenciaEntrada {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		// El usuario introduce el radio
		System.out.print("Introduzca el radio: ");
		double radio = entrada.nextDouble();
		
        double longitud = 2.0 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2.0);

        System.out.println("Radio = " + radio);
        System.out.println();
        System.out.printf("Perimetro de la circunferencia = %.3f", longitud);
        System.out.println();
        System.out.printf("Area de la circunferencia = %.3f", area);
        System.out.println();

        entrada.close();
	}
}
