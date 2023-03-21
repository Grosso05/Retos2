import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        
        // Pedir al usuario las dimensiones de la matriz
        System.out.println("Bienvenido al juego de sudoku");
        System.out.println("A continuacion se le solicitara las medidas del tablero. USE EL MISMO NUMERO PARA FILAS Y COLUMNAS");
        System.out.println("Ingrese el número de filas: ");
        int filas = Leer.nextInt();
        System.out.println("Ingrese el número de columnas: ");
        int columnas = Leer.nextInt();

        int[][] tablero = new int[filas][columnas];

   
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingrese el valor para la celda (" + i + ", " + j + "): ");
                tablero[i][j] = Leer.nextInt();
            }
        }

        // Imprimir la matriz
        System.out.println("La matriz es:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }

        int tamano = tablero.length;
        int sumaDiagonal1 = 0;
        int sumaDiagonal2 = 0;
        
        // Calcular la suma de las filas y columnas
        int[] sumaFilas = new int[tamano];
        int[] sumaColumnas = new int[tamano];
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                sumaFilas[i] += tablero[i][j];
                sumaColumnas[j] += tablero[i][j];
            }
        }
        
        // Calcular la suma de las diagonales
        for (int i = 0; i < tamano; i++) {
            sumaDiagonal1 += tablero[i][i];
            sumaDiagonal2 += tablero[i][tamano - i - 1];
        }
        
        // Verificar que todas las sumas sean iguales
        int sumaEsperada = sumaFilas[0];
        boolean sumaIgual = true;
        for (int i = 0; i < tamano; i++) {
            if (sumaFilas[i] != sumaEsperada || sumaColumnas[i] != sumaEsperada) {
                sumaIgual = false;
                break;
            }
        }
        if (sumaDiagonal1 != sumaEsperada || sumaDiagonal2 != sumaEsperada) {
            sumaIgual = false;
        }
        
        // Imprimir el resultado
        if (sumaIgual) {
            System.out.println("La suma de las filas, columnas y diagonales es igual a " + sumaEsperada);
        } else {
            System.out.println("La suma de las filas, columnas y diagonales no es igual");
        }
        Leer.close();
    }
}
