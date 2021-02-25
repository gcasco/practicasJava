package Clase3;

import java.util.Arrays;
import java.util.Comparator;

public class QuickSortSorterImple implements Sorter{
    @Override
    public <T> void sort(T[] arr, Comparator<T> c) {
        int izquierda, derecha,max;
        T mitad, x;
        izquierda =arr[0].hashCode();
        derecha=  arr[arr.length].hashCode();
        max=0;
        for (T t:arr){
            if(t.hashCode()>max){
                max=t.hashCode();
            }
        }
        mitad = arr[(izquierda + derecha) / 2];

        do {
            while (c.compare(arr[izquierda],mitad) < 0 && izquierda < max) {
                izquierda++;
            }
            while (c.compare(arr[derecha],mitad) < 0 && derecha > izquierda) {
                derecha--;
            }

            if (izquierda <= derecha) {

                x = arr[izquierda];
                arr[izquierda] = arr[derecha];
                arr[derecha] = x;

                izquierda++;
                derecha--;

            }

        } while (izquierda <= derecha);

        if (0 < derecha) {
            sort(arr, c);
        }

        if (izquierda < arr[arr.length].hashCode()) {
            sort(arr, c);
        }
    }
}
