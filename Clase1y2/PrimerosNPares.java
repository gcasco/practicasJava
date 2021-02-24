package Clase1y2;

import java.util.Scanner;

public class PrimerosNPares {

    public static void main(String arg[]){


        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un numero:");
        int i=scanner.nextInt();
        for(int j=1;j<=i;j++){
            double mod=j%2;
            if(mod == 0){
                System.out.println(j);
            }
        }
        scanner.close();

    }
}