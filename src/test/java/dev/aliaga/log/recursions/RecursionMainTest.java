package dev.aliaga.log.recursions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionMainTest {

    @Test
    void factorialRecursion() {
        assertEquals(120, RecursionMain.factorialRecursion(5));
        assertEquals(720, RecursionMain.factorialRecursion(6));
        assertEquals(5040, RecursionMain.factorialRecursion(7));
        assertEquals(40320, RecursionMain.factorialRecursion(8));
        assertEquals(362880, RecursionMain.factorialRecursion(9));
        assertEquals(3628800, RecursionMain.factorialRecursion(10));
        assertEquals(39916800, RecursionMain.factorialRecursion(11));
    }

    @Test
    void factorialRecursionV2() {
        assertEquals(120, RecursionMain.factorialRecursionV2(5));
        assertEquals(720, RecursionMain.factorialRecursionV2(6));
        assertEquals(5040, RecursionMain.factorialRecursionV2(7));
        assertEquals(40320, RecursionMain.factorialRecursionV2(8));
        assertEquals(362880, RecursionMain.factorialRecursionV2(9));
        assertEquals(3628800, RecursionMain.factorialRecursionV2(10));
        assertEquals(39916800, RecursionMain.factorialRecursionV2(11));
    }

    @Test
    void noSubtractRecursion() {
        assertEquals(4, RecursionMain.noSubtractRecursion(5, 1));
        assertEquals(3, RecursionMain.noSubtractRecursion(4, 1));
        assertEquals(5, RecursionMain.noSubtractRecursion(10, 5));
        assertEquals(4, RecursionMain.noSubtractRecursion(10, 6));
        assertEquals(50, RecursionMain.noSubtractRecursion(60, 10));
        assertEquals(50, RecursionMain.noSubtractRecursion(51, 1));
    }

    @Test
    void multiplyRecursion() {
        assertEquals(10, RecursionMain.multiplyRecursion(5, 2));
        assertEquals(30, RecursionMain.multiplyRecursion(15, 2));
        assertEquals(10, RecursionMain.multiplyRecursion(2, 5));
        assertEquals(100, RecursionMain.multiplyRecursion(50, 2));
        assertEquals(100, RecursionMain.multiplyRecursion(25, 4));
    }
}