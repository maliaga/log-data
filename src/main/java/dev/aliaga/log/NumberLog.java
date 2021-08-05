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

    public static boolean friendsNumbers(int number1, int number2) {
        int accum1 = 0;
        int accum2 = 0;

        for (int i = 1; i <= number1/2; i++) {
            if (number1 % i == 0)
                accum1 += i;
        }

        for (int i = 1; i <= number2/2; i++) {
            if (number2 % i == 0)
                accum2 += i;
        }

        return (number1 == accum2) && (number2 == accum1);
    }
}
