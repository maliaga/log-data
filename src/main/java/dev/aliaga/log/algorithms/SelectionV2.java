package dev.aliaga.log.algorithms;

import java.util.Arrays;

public class SelectionV2 {

    public static int[] selectionV2(int[] arr) {
        int posMin;
        for (int i = 0; i < arr.length; i++) {
            posMin = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[posMin] > arr[j])
                    posMin = j;
            }
            int aux = arr[i];
            arr[i] = arr[posMin];
            arr[posMin] = aux;
        }

        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
