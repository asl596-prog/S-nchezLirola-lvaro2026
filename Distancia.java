import java.util.Scanner;
 
public class Distancia {
 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
 
        System.out.print("Introduzca la coordenada x (entero): ");
        int x = teclado.nextInt();
 
        System.out.print("Introduzca la coordenada y (entero): ");
        int y = teclado.nextInt();
 
        double distancia = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
 
        System.out.println("Distancia de (" + x + ", " + y + ") a (0, 0) = " + distancia);
 
        teclado.close();
    }
}
 