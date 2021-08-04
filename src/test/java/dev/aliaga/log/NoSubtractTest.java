package dev.aliaga.log;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NoSubtractTest {

    @Test
    void noSubtract() {
        NoSubtract noSubtract = new NoSubtract();
        assertEquals(4, noSubtract.noSubtract(5, 1));
        noSubtract = new NoSubtract();
        assertEquals(3, noSubtract.noSubtract(4, 1));
        noSubtract = new NoSubtract();
        assertEquals(4, noSubtract.noSubtract(1, 5));
        noSubtract = new NoSubtract();
        assertEquals(4, noSubtract.noSubtract(10, 6));
        noSubtract = new NoSubtract();
        assertEquals(4, noSubtract.noSubtract(6, 10));
        noSubtract = new NoSubtract();
        assertEquals(50, noSubtract.noSubtract(51, 1));
    }
}