public class Relacion1Ej03 {
 
    public static void main(String[] args) {
        double altura = 0.1;            
        double radio = 0.03;             
        double densidadCarga = 1.0E-6;    
        double volumen = Math.PI * Math.pow(radio, 2) * altura;
        double cargaTotal = densidadCarga * volumen;
        
     
        System.out.println("Solucion al ejercicio 3 de la relacion 1: Relacion1Ej03");
        System.out.println("========================");
        System.out.println("ENUNCIADO:");
        System.out.println("3) Un cilindro de 10 cm de altura y radio de la base 3 cm tiene una densidad homogenea");
        System.out.println("de carga volumetrica de 1 uC/m^3. Calcular la carga total que almacena.");
        System.out.println("========================");
        System.out.println("DATOS:");
        System.out.println("Altura = " + altura + " m");
        System.out.println("Radio = " + radio + " m");
        System.out.println("Densidad de carga = " + densidadCarga);
        System.out.println("========================");
        System.out.println("SOLUCION:");
        System.out.println("La carga total almacenada es: " + cargaTotal + " C");
        System.out.println("========================");
    }
}