package org.ip2027.tema01;

public class Circunferencia {

public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    // El usuario introduce el radio
    System.out.print("Introduzca el radio:  ");
    double radio = entrada.nextDouble();
    
    double diametro = 2.0 * radio; 
    
    double longitud = 2.0 * Math.PI * radio;
    double area = Math.PI * Math.pow(radio, 2.0);

    System.out.println("Radio = " + radio);
    System.out.println();
    System.out.printf("Diametro de la circunferencia = " + diametro);  // Now diametro is defined
    System.out.println();
    System.out.printf("Perimetro de la circunferencia = %.3f", longitud);
    System.out.println();
    System.out.printf("Area de la circunferencia = %.3f", area);
    System.out.println();
    double volumenEsfera = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    double areaEsfera = 4 * Math.PI * Math.pow(radio, 2);

    System.out.printf("Volumen de la esfera = %.3f", volumenEsfera);
    System.out.println();
    System.out.printf("Area de la esfera = %.3f", areaEsfera);
    System.out.println();
    
    entrada.close();
   }
}+