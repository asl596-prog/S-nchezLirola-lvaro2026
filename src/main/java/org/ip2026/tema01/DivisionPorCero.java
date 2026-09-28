package org.ip2026.tema01;
/*************************************************************************
 *  Muestra lo que ocurre cuando divides por cero con enteros y reales
 * 
 *  17.0 / 0.0 = Infinity
 *  17.0 % 0.0 = NaN
 *  Exception in thread "main" java.lang.ArithmeticException: / by zero
 *
 *
 *************************************************************************/

public class DivisionPorCero {
    public static void main(String[] args) {
    	System.out.println();
    	System.out.println("EJEMPLOS DE DIVISIONES POR CERO CON ENTEROS Y REALES");
    	System.out.println();
        System.out.println("17.0 / 0.0 = " + (17.0 / 0.0));  // infinity
        System.out.println("17.0 % 0.0 = " + (17.0 % 0.0)); // not a number
        System.out.println("17 / 0 = " );
        System.out.println (17 / 0);          // ERROR
        
    }
}

