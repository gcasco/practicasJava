package Clase3.TurnoTarde;

import java.util.Comparator;
import java.util.Scanner;

public class BubbleSortSorterImple implements Sorter {

    Scanner input = new Scanner(System.in);

    @Override
    public <T> void sort(T[] arr, Comparator<T> c) {
        int size = arr.length;

        // for ascending or descending sort
        //Para ejercicio 13 le seteo para ordenar en ascendente y saber el tiempo:
        //System.out.println("Choose Sorting Order:");
        //System.out.println("1 for Ascending \n2 for Descending");
        int sortOrder = 1;//input.nextInt();

        // run loops two times
        // first loop access each element of the array
        for (int i = 0; i < size - 1; i++)

            // second loop performs the comparison in each iteration
            for (int j = 0; j < size - i - 1; j++)

                // sort the array in ascending order
                if (sortOrder == 1) {
                    // compares the adjacent element
                    if (c.compare(arr[j],arr[j + 1])>0) {

                        // swap if left element is greater than right
                        T temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }

                // sort the array in descending order
                else {
                    // compares the adjacent element
                    if (c.compare(arr[j],arr[j + 1])<0) {

                        // swap if left element is smaller than right
                        T temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
    }
}
