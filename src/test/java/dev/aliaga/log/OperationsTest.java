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
}