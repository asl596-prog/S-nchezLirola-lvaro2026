public class EnteroAleatorio {
 
    public static void main(String[] args) {
        int M = -15;
        int N = 15;
 
        System.out.println("Vamos a generar un entero aleatorio entre " + M + " y " + N);
        System.out.println();
 
        double aleatorio = Math.random();
 
        int valorEntero = (int) Math.floor(aleatorio * (N - M + 1)) + M;
 
        System.out.println("El entero generado aleatoriamente es: " + valorEntero);
    }
}