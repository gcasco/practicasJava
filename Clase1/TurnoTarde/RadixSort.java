package Clase1.TurnoTarde;

import java.util.ArrayList;
import java.util.Arrays;

public class RadixSort {

    private static int maxLength;


    public static void sort(ArrayList arr, int indice) {

        ArrayList[] listas= new ArrayList[10];
        int longitudString = arr.get(0).toString().length()-1;

        for(int i = 0; i<=longitudString ;i++){
            //inicializa listas
            for (int k=0;k<10;k++ ){
                listas[k] =new ArrayList();
            }
            for(int j = 0; j<arr.size();j++){
                int lista = arr.get(j).toString().charAt(longitudString-i) - '0';
                listas[lista].add(arr.get(j));
            }
            //genero array resultante
            arr = new ArrayList();
            for (ArrayList l:listas){
                if(l.size()>0) {
                    arr.addAll(l);
                }
            }
            System.out.println("La lista resultante es: "+Arrays.toString(arr.toArray()));
        }

    }

    public static ArrayList normalize(String[] array, String value) {
        int maxLength = 0;
        ArrayList normalizeArray = new ArrayList();
        for (String i : array) {
            if (i.length() > maxLength) {
                maxLength = i.length();
            }
        }
        System.out.println("longitud maxima de los elementos: " + maxLength);
        StringBuilder relleno;
        for (int i = 0; i < array.length; i++) {

            relleno = new StringBuilder("");
            if (array[i].length() < maxLength) {
                for (int j = array[i].length(); j < maxLength; j++) {
                    relleno.append(value);
                }
            }
            normalizeArray.add(relleno.append(array[i]).toString());
        }
        return normalizeArray;
    }

    public static void main(String[] args) {
        int arr[] = {23, 455, 678, 12, 567, 97};
        radixSort(arr);
    }

    public static void radixSort(int arr[]) {

        String stringArr[] = Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        ArrayList radixSortFinal = normalize(stringArr, "0");
        System.out.println("El array normalizado es el siguiente: " + radixSortFinal.toString());
        sort(radixSortFinal, radixSortFinal.get(0).toString().length());
    }
}
