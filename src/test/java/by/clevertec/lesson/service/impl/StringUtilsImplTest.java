package by.clevertec.lesson.service.impl;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import by.clevertec.lesson.service.StringUtils;
import org.junit.jupiter.api.Test;

class StringUtilsImplTest {

    private final StringUtils stringUtils;

    {
        stringUtils = new StringUtilsImpl();
    }

    @Test
    void test_isPositiveNumber_true() {
        assertTrue(stringUtils.isPositiveNumber("2"));
        assertTrue(stringUtils.isPositiveNumber("2.2"));
        assertTrue(stringUtils.isPositiveNumber("2,2"));
        assertTrue(stringUtils.isPositiveNumber("0.1"));
    }

    @Test
    void test_isPositiveNumber_false() {
       assertFalse(stringUtils.isPositiveNumber("0"));
       assertFalse(stringUtils.isPositiveNumber("-2"));
       assertFalse(stringUtils.isPositiveNumber("A"));
       assertFalse(stringUtils.isPositiveNumber(""));
       assertFalse(stringUtils.isPositiveNumber("я"));
       assertFalse(stringUtils.isPositiveNumber("("));
    }
}
