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

    public static void main(String[] args) {
        countDown(10);
        System.out.println(factorialRecursion(5));
    }
}
