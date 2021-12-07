package dev.aliaga.log.algorithms;

import java.util.Arrays;

public class Selection {
    public static int[] selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            changePosition(arr, getPositionLowValue(arr, i), i);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    private static void changePosition(int[] arr,
                                       int positionLowValue,
                                       int actualPosition) {
        int aux = arr[positionLowValue];
        arr[positionLowValue] = arr[actualPosition];
        arr[actualPosition] = aux;
    }

    private static int getPositionLowValue(int[] arr,
                                           int actualPosition) {
        int minValue = arr[actualPosition];
        int minPosition = 0;
        for (int i = actualPosition; i < arr.length; i++) {
            if (arr[i] <= minValue) {
                minValue = arr[i];
                minPosition = i;
            }
        }
        return minPosition;
    }
}
