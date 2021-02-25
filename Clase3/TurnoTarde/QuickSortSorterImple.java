package Clase3.TurnoTarde;

import java.util.Comparator;

public class QuickSortSorterImple<T> implements Sorter {

    @Override
    public <T> void sort(T[] arr, Comparator<T> c) {
        int l=0;
        int h=arr.length-1;

        // Create an auxiliary stack
        int[] stack = new int[h - l + 1];

        // initialize top of stack
        int top = -1;

        // push initial values of l and h to stack
        stack[++top] = l;
        stack[++top] = h;

        // Keep popping from stack while is not empty
        while (top >= 0) {
            // Pop h and l
            h = stack[top--];
            l = stack[top--];

            // Set pivot element at its correct position
            // in sorted array
            T pivot = arr[h];

            // index of smaller element
            int i = (l - 1);
            for (int j = l; j <= h - 1; j++) {
                // If current element is smaller than or
                // equal to pivot
                if (c.compare(arr[j], pivot) < 0) {
                    i++;

                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            // swap arr[i+1] and arr[high] (or pivot)
            T temp = arr[i + 1];
            arr[i + 1] = arr[h];
            arr[h] = temp;
            int p = i+1;

            // If there are elements on left side of pivot,
            // then push left side to stack
            if (p - 1 > l) {
                stack[++top] = l;
                stack[++top] = p - 1;
            }

            // If there are elements on right side of pivot,
            // then push right side to stack
            if (p + 1 < h) {
                stack[++top] = p + 1;
                stack[++top] = h;
            }
        }

    }

}
