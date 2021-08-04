package dev.aliaga.log;

public class Operations {

    public static int noSubtract(int a,
                          int b) {
        int value = 0;
        int min = a;
        int max = b;

        if (a > b) {
            min = b;
            max = a;
        }

        while (min < max) {
            min++;
            value++;
        }

        return value;
    }

    /**
     * Multiply without multiply
     * @param a number
     * @param b number
     * @return result
     */
    public static int multiply(int a, int b) {
        int value = 0;
        for (int i = 0; i < b; i++) {
            value += a;
        }
        return value;
    }
}
