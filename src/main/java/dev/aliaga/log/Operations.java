package dev.aliaga.log;

public class Operations {

    /**
     * Subtract without subtract
     * @param a number
     * @param b number
     * @return result
     */
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

    /**
     * Divide without divide
     * @param a number
     * @param b number
     * @return result
     */
    public static int divide(int a, int b) {
        if (a == 0 || b > a) return 0;
        int value = 0;
        while (a >= b) {
            a-=b;
            value++;
        }
        return value;
    }

    /**
     * Pow without pow
     * @param a number
     * @param b number
     * @return result
     */
    public static int pow(int a, int b) {
        if (b == 0) return a;
        int value = a;
        for (int i = 1; i < b; i++) {
            value*=a;
        }
        return value;
    }
}
