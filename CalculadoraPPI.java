
public class CalculadoraPPI {
 
    public static void main(String[] args) {
 
        // --- Dispositivo 1: Monitor Full HD de 27 pulgadas ---
        int anchoResolucion1 = 1920;
         int altoResolucion1 = 1080;
        double tamañoDiagonal1 = 27;
        double ppi1 = Math.sqrt(Math.pow(anchoResolucion1, 2) + Math.pow(altoResolucion1, 2)) / tamañoDiagonal1;
  // --- Dispositivo 2: Monitor 4K de 32 pulgadas ---
        int anchoResolucion2 = 3840;
         int altoResolucion2 = 2160;
        double tamañoDiagonal2 = 32;
         double ppi2 = Math.sqrt(Math.pow(anchoResolucion2, 2) + Math.pow(altoResolucion2, 2)) / tamañoDiagonal2;
 
        // --- Dispositivo 3: Dispositivo móvil de 6.5 pulgadas// ---
         int anchoResolucion3 = 2340;
        int altoResolucion3 = 1080;
        double tamañoDiagonal3 = 6.5;
         double ppi3 = Math.sqrt(Math.pow(anchoResolucion3, 2) + Math.pow(altoResolucion3, 2)) / tamañoDiagonal3;
 
         System.out.printf("La densidad PPI del Monitor Full HD de 27 pulgadas (1920x1080) es: %.3f%n", ppi1);
         System.out.printf("La densidad PPI del Monitor 4K de 32 pulgadas (3840x2160) es: %.3f%n", ppi2);
         System.out.printf("La densidad PPI del Dispositivo movil de 6.5 pulgadas (2340x1080) es: %.3f%n", ppi3);
    }
}