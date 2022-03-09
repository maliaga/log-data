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
}