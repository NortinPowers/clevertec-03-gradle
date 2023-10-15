package by.clevertec.core;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class UtilsTest {

    private final Utils utils;

    {
        utils = new Utils();
    }

    @Test
    void test_isAllPositiveNumbers_true() {
        assertTrue(utils.isAllPositiveNumbers("12", "79"));
        assertTrue(utils.isAllPositiveNumbers("5", "2.2"));
        assertTrue(utils.isAllPositiveNumbers("5", "2", "6", "12"));
    }

    @Test
    void test_isAllPositiveNumbers_false() {
        assertFalse(utils.isAllPositiveNumbers(""));
        assertFalse(utils.isAllPositiveNumbers("-2"));
        assertFalse(utils.isAllPositiveNumbers("2", ""));
        assertFalse(utils.isAllPositiveNumbers("2", "-2"));
        assertFalse(utils.isAllPositiveNumbers("2", "-"));
        assertFalse(utils.isAllPositiveNumbers("2", "3", "5", "0"));
    }
}
