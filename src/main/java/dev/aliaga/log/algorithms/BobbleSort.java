package dev.aliaga.log.algorithms;

public class BobbleSort {

    public static void sort(int[] arr) {
        print(arr);

        int aux;
        int rounds = 0;
        boolean ord = false;

        while (!ord) {
            ord = true;
            for (int i = 0; i < arr.length - 1 - rounds; i++) {
                if (arr[i] > arr[i + 1]) {
                    aux = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = aux;
                    ord = false;
                }
            }
            rounds++;
        }

        print(arr);
    }

    private static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println("");
    }
}
