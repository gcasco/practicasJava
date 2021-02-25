package Clase1.TurnoMañana;

import java.util.Scanner;

public class PrimerosNMultiplosM {

    public static void main(String arg[]) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de multiplos a visualizar (n):");
        int n = scanner.nextInt();

        System.out.print("Ingrese el numero del cual buscar los multiplos (m):");
        int m = scanner.nextInt();

        int contadorDeMultiplos = 0;
        int j = 1;
        while (contadorDeMultiplos < n) {
            double mod = j % m;
            if (mod == 0) {
                System.out.println(j);
                contadorDeMultiplos++;
            }
            j++;

        }
        scanner.close();

    }
}
