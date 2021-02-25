package Clase1.TurnoMañana;

import java.util.Scanner;

public class PrimerosNPrimos {

    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de numeros primos:");
        int p = scanner.nextInt();

        int contadorDePrimos = 0;
        int limiteSuperior = 10 * p;

        for (int i = 1; i < limiteSuperior; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
                contadorDePrimos++;
            }
            if (contadorDePrimos == p) {
                i = limiteSuperior;
            }
        }
        scanner.close();

    }

    public static boolean esPrimo(int n) {
        boolean esPrimo = true;

        for (int j = 1; j < n; j++) {
            double mod = n % j;
            if (mod == 0 && j > 1) {
                esPrimo = false;
            }
        }
        return esPrimo;
    }
}
