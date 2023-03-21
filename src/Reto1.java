import java.util.Scanner;

public class Reto1{
    public static void main(String[] args) {


        Scanner Leer = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de notas a evaluar: ");
        int numNotas = Leer.nextInt();
        
        double[] notas = new double[numNotas];
        double sumaNotas = 0;
        
        for (int i = 0; i < numNotas; i++) {
            System.out.print("Ingrese el valor de la nota " + (i+1) + ": ");
            notas[i] = Leer.nextDouble();
            sumaNotas += notas[i];
        }
        
        double promedioNotas = sumaNotas / numNotas;
        
        System.out.println("El promedio de las notas es: " + promedioNotas);

        if(promedioNotas<3){
            System.out.println(" Y Haz reprobado");
        }
        else if (promedioNotas>4){
            System.out.println("Y aprobaste con buenos resultados");
        }
        else {
            System.out.println("Y Pasaste raspando");
        }
        Leer.close();
    }
}
