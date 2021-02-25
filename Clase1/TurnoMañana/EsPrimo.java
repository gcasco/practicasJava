package Clase1.TurnoMañana;

import java.util.Scanner;

public class EsPrimo {

    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Es Primo el..:");
        int i = scanner.nextInt();
        boolean esPrimo = true;

        for (int j = 1; j < i; j++) {
            double mod = i % j;
            if (mod == 0 && j > 1) {
                esPrimo = false;
            }
        } //jnk


        System.out.println(esPrimo);


        scanner.close();

    }
}
