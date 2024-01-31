package by.clevertec.core;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class UtilTest {

    private final Util util;

    {
        util = new Util();
    }

    @Test
    void test_isAllPositiveNumbers_true() {
        assertTrue(util.isAllPositiveNumbers("12", "79"));
        assertTrue(util.isAllPositiveNumbers("5", "2.2"));
        assertTrue(util.isAllPositiveNumbers("5", "2", "6", "12"));
    }

    @Test
    void test_isAllPositiveNumbers_false() {
        assertFalse(util.isAllPositiveNumbers(""));
        assertFalse(util.isAllPositiveNumbers("-2"));
        assertFalse(util.isAllPositiveNumbers("2", ""));
        assertFalse(util.isAllPositiveNumbers("2", "-2"));
        assertFalse(util.isAllPositiveNumbers("2", "-"));
        assertFalse(util.isAllPositiveNumbers("2", "3", "5", "0"));
    }
}
