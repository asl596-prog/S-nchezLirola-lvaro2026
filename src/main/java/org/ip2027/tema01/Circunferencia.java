package org.ip2027.tema01;

public class Circunferencia {

	public static void main(String[] args) {
        double radio = 4.57;
        double diametro = 2.0 * radio;
        double longitud = 2.0 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2.0);

        System.out.println("Radio = " + radio);
        System.out.println();
        System.out.printf("Diametro de la circunferencia = " + diametro);
        System.out.println();
        System.out.printf("Perimetro de la circunferencia = %.3f", longitud);
        System.out.println();
        System.out.printf("Area de la circunferencia = %.3f", area);
        System.out.println();
	}
}
