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

    @Test
    void friendsNumbers() {
        assertTrue(NumberLog.friendsNumbers(220, 284));
        assertTrue(NumberLog.friendsNumbers(1184, 1210));
        assertFalse(NumberLog.friendsNumbers(6, 28));
    }

    @Test
    void guayNumber() {
        assertFalse(NumberLog.guayNumber(7));
        assertFalse(NumberLog.guayNumber(8));
        assertFalse(NumberLog.guayNumber(9));
        assertTrue(NumberLog.guayNumber(10));
        assertTrue(NumberLog.guayNumber(15));
    }
}