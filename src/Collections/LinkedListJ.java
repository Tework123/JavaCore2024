package Collections;

import java.util.Arrays;

public class LinkedListJ {
    public static void main(String[] args) {
        Object[] object = {new Object()};
        int[] x = {1, 2, 3, 4};
        java.util.Arrays.sort(object);

        int[] array = {10, 2, 10, 3, 1, 2, 5};
        int[] array2 = new int[15];
        sortImpl(array, array2, 0, array.length - 1);

    }

    private static void sortImpl(int[] integers, int[] arrayBuffer, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int middle = (leftIndex + rightIndex) / 2;
            sortImpl(integers, arrayBuffer, leftIndex, middle);
            sortImpl(integers, arrayBuffer, middle + 1, rightIndex);

            int k = leftIndex;
            for (int i = leftIndex, j = middle + 1; i <= middle || j <= rightIndex; ) {
                if (j > rightIndex || (i <= middle && integers[i] < integers[j])) {
                    arrayBuffer[k] = integers[i];
                    ++i;
                } else {
                    arrayBuffer[k] = integers[j];
                    ++j;
                }
                ++k;
            }

            for (int i = leftIndex; i <= rightIndex; i++) {
                integers[i] = arrayBuffer[i];
            }

        }
        System.out.println(Arrays.toString(arrayBuffer));
    }
}
