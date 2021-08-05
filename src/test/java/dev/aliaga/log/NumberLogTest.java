package dev.aliaga.log;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberLogTest {

    @Test
    void perfectNumber() {
        assertTrue(NumberLog.perfectNumber(6));
        assertTrue(NumberLog.perfectNumber(28));
        assertTrue(NumberLog.perfectNumber(496));

        assertFalse(NumberLog.perfectNumber(66));
        assertFalse(NumberLog.perfectNumber(2828));
        assertFalse(NumberLog.perfectNumber(497));
    }
}