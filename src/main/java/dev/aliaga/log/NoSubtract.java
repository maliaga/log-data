package dev.aliaga.log;

public class NoSubtract {

    public int noSubtract(int a,
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
}
