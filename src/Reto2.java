import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de competidores: ");
        int numCompetidores = Leer.nextInt();
        
        String[] nombres = new String[numCompetidores];
        double[] tiempos = new double[numCompetidores];
        
        for (int i = 0; i < numCompetidores; i++) {
            System.out.print("Ingrese el nombre del competidor " + (i+1) + ": ");
            nombres[i] = Leer.next();
            
            System.out.print("Ingrese el tiempo del competidor " + (i+1) + ": ");
            tiempos[i] = Leer.nextDouble();
        }
        
        System.out.println("Competidores y tiempos:");
        for (int i = 0; i < numCompetidores; i++) {
            System.out.println(nombres[i] + ": " + tiempos[i] + " segundos");
        }
        Leer.close();
    }
}
