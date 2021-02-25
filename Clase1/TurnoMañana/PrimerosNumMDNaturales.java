package Clase1.TurnoMañana;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimerosNumMDNaturales {
/*
Desarrollar un programa para mostrar por consola los primeros n números naturales que
tienen al menos m dígitos d, siendo n, m y d valores que el usuario ingresará por consola.
*/

    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese la cantidad de números a encontrar (n):");
        int n = scanner.nextInt();

        System.out.print("ingrese la cantidad minima de dígitos (m):");
        int m = scanner.nextInt();

        System.out.print("ingrese el dígito (d):");
        int d = scanner.nextInt();
        int contadorNumeros = 0;
        int valor = 1;

        ArrayList<String> numeros = new ArrayList<>(m * 100 * m);
        while (contadorNumeros < n) {
            numeros.add(String.valueOf(valor));
            int cantidadDigitos = 0;
            if (String.valueOf(valor).length() >= m
                    && String.valueOf(valor).contains(String.valueOf(d))) {
                for (int i = 0; i < String.valueOf(valor).length(); i++) {
                    if (String.valueOf(valor).charAt(i) == String.valueOf(d).charAt(0)) {
                        cantidadDigitos++;
                    }
                }
                if (cantidadDigitos >= m) {
                    System.out.println(valor);
                    contadorNumeros++;
                }
            }
            valor++;
        }
        scanner.close();
    }
}
