package dev.aliaga.log;

public class NumberLog {

    public static boolean perfectNumber(int number) {
        int accum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                accum += i;
        }

        return accum == number;
    }
}
