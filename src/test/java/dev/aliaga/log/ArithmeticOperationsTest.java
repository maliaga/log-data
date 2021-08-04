package dev.aliaga.log;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArithmeticOperationsTest {

    @Test
    void noSubtract() {
        assertEquals(4, ArithmeticOperations.noSubtract(5, 1));
        assertEquals(3, ArithmeticOperations.noSubtract(4, 1));
        assertEquals(4, ArithmeticOperations.noSubtract(1, 5));
        assertEquals(4, ArithmeticOperations.noSubtract(10, 6));
        assertEquals(4, ArithmeticOperations.noSubtract(6, 10));
        assertEquals(50, ArithmeticOperations.noSubtract(51, 1));
    }

    @Test
    void multiply() {
        assertEquals(10, ArithmeticOperations.multiply(5, 2));
        assertEquals(30, ArithmeticOperations.multiply(15, 2));
        assertEquals(10, ArithmeticOperations.multiply(2, 5));
        assertEquals(100, ArithmeticOperations.multiply(50, 2));
        assertEquals(100, ArithmeticOperations.multiply(25, 4));
    }

    @Test
    void divide() {
        assertEquals(2, ArithmeticOperations.divide(5, 2));
        assertEquals(7, ArithmeticOperations.divide(15, 2));
        assertEquals(4, ArithmeticOperations.divide(20, 5));
        assertEquals(25, ArithmeticOperations.divide(50, 2));
        assertEquals(6, ArithmeticOperations.divide(25, 4));
        assertEquals(0, ArithmeticOperations.divide(2, 4));
        assertEquals(0, ArithmeticOperations.divide(0, 4));
    }

    @Test
    void pow() {
        assertEquals(8, ArithmeticOperations.pow(2, 3));
        assertEquals(9, ArithmeticOperations.pow(3, 2));
        assertEquals(2197, ArithmeticOperations.pow(13,3));
        assertEquals(13, ArithmeticOperations.pow(13,0));
        assertEquals(65536, ArithmeticOperations.pow(16,4));
    }

    @Test
    void factorial() {
        assertEquals(6, ArithmeticOperations.factorial(3));
        assertEquals(24, ArithmeticOperations.factorial(4));
        assertEquals(120, ArithmeticOperations.factorial(5));
        assertEquals(720, ArithmeticOperations.factorial(6));
        assertEquals(5040, ArithmeticOperations.factorial(7));
    }
}