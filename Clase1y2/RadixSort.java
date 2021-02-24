package Clase1y2;

import java.util.ArrayList;
import java.util.Arrays;

public class RadixSort {

    private static int maxLength;


    public static void radixSort(int arr[]) {

        String stringArr[] = Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        ArrayList radixSortFinal = normalize(stringArr, "0");
        System.out.println("El array normalizado es el siguiente: " + radixSortFinal.toString());
        sort(radixSortFinal, radixSortFinal.get(0).toString().length());
        sort(radixSortFinal, radixSortFinal.get(0).toString().length() - 1);


    }

    public static void sort(ArrayList arr, int indice) {

        ArrayList L2 = new ArrayList();
        ArrayList L0 = new ArrayList();
        ArrayList L3 = new ArrayList();
        ArrayList L1 = new ArrayList();
        ArrayList L4 = new ArrayList();
        ArrayList L5 = new ArrayList();
        ArrayList L6 = new ArrayList();
        ArrayList L7 = new ArrayList();
        ArrayList L8 = new ArrayList();
        ArrayList L9 = new ArrayList();

        for (int i = 0; i < arr.size(); i++) {
            switch (arr.get(i).toString().charAt(indice - 1)) {
                case '0':
                    L0.add(arr.get(i));
                    break;
                case '1':
                    L1.add(arr.get(i));
                    break;
                case '2':
                    L2.add(arr.get(i));
                    break;
                case '3':
                    L3.add(arr.get(i));
                    break;
                case '4':
                    L4.add(arr.get(i));
                    break;
                case '5':
                    L5.add(arr.get(i));
                    break;
                case '6':
                    L6.add(arr.get(i));
                    break;
                case '7':
                    L7.add(arr.get(i));
                    break;
                case '8':
                    L8.add(arr.get(i));
                    break;
                case '9':
                    L9.add(arr.get(i));
                    break;
                default:
                    break;
            }
        }
        System.out.println("Clasificando en listas en orden ascendente: ");
        System.out.println("L0=" + L0.toString());
        System.out.println("L1=" + L1.toString());
        System.out.println("L2=" + L2.toString());
        System.out.println("L3=" + L3.toString());
        System.out.println("L4=" + L4.toString());
        System.out.println("L5=" + L5.toString());
        System.out.println("L6=" + L6.toString());
        System.out.println("L7=" + L7.toString());
        System.out.println("L8=" + L8.toString());
        System.out.println("L9=" + L9.toString());

        ArrayList radixSortFinal = L0;
        radixSortFinal.addAll(L1);
        radixSortFinal.addAll(L2);
        radixSortFinal.addAll(L3);
        radixSortFinal.addAll(L4);
        radixSortFinal.addAll(L5);
        radixSortFinal.addAll(L6);
        radixSortFinal.addAll(L7);
        radixSortFinal.addAll(L8);
        radixSortFinal.addAll(L9);

        System.out.println("Lista ordenada segun indice " + indice);
        System.out.println(radixSortFinal);
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
}
