package dev.aliaga.log;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OperationsTest {

    @Test
    void noSubtract() {
        assertEquals(4, Operations.noSubtract(5, 1));
        assertEquals(3, Operations.noSubtract(4, 1));
        assertEquals(4, Operations.noSubtract(1, 5));
        assertEquals(4, Operations.noSubtract(10, 6));
        assertEquals(4, Operations.noSubtract(6, 10));
        assertEquals(50, Operations.noSubtract(51, 1));
    }

    @Test
    void multiply() {
        assertEquals(10, Operations.multiply(5, 2));
        assertEquals(30, Operations.multiply(15, 2));
        assertEquals(10, Operations.multiply(2, 5));
        assertEquals(100, Operations.multiply(50, 2));
        assertEquals(100, Operations.multiply(25, 4));
    }

    @Test
    void divide() {
        assertEquals(2, Operations.divide(5, 2));
        assertEquals(7, Operations.divide(15, 2));
        assertEquals(4, Operations.divide(20, 5));
        assertEquals(25, Operations.divide(50, 2));
        assertEquals(6, Operations.divide(25, 4));
        assertEquals(0, Operations.divide(2, 4));
        assertEquals(0, Operations.divide(0, 4));
    }

    @Test
    void pow() {
        assertEquals(8, Operations.pow(2, 3));
        assertEquals(9, Operations.pow(3, 2));
        assertEquals(2197, Operations.pow(13,3));
        assertEquals(13, Operations.pow(13,0));
        assertEquals(65536, Operations.pow(16,4));
    }
}