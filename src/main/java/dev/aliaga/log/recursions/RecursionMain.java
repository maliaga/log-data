package dev.aliaga.log.recursions;

public class RecursionMain {

    static void countDown(int num) {
        System.out.println(num);
        if (num > 0) {
            countDown(num - 1);
        } else {
            System.out.println("End countDown");
        }
    }

    static int factorialRecursion(int num) {
        if (num > 1) {
            int aux;
            aux = factorialRecursion(num - 1);
            num *=aux;
        }
        return num;
    }

    public static int noSubtractRecursion(int a, int b) {
        int value = 0;
        if (a > b) {
            value++;
            value+=noSubtractRecursion(a -1, b);
        }
        return value;
    }

    public static int multiplyRecursion(int a, int b) {
        int result = 0;
        if (b > 0) {
            result+=a;
            result+=multiplyRecursion(a, b - 1);
        }

        return result;
    }

    public static void main(String[] args) {
       // countDown(10);
        //System.out.println(factorialRecursion(5));
        System.out.println(multiplyRecursion(5,2));
    }
}
