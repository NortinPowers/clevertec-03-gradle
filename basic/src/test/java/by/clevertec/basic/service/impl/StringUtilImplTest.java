package by.clevertec.basic.service.impl;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import by.clevertec.basic.service.StringUtil;
import org.junit.jupiter.api.Test;

class StringUtilImplTest {

    private final StringUtil stringUtil;

    {
        stringUtil = new StringUtilImpl();
    }

    @Test
    void test_isPositiveNumber_true() {
        assertTrue(stringUtil.isPositiveNumber("2"));
        assertTrue(stringUtil.isPositiveNumber("2.2"));
        assertTrue(stringUtil.isPositiveNumber("2,2"));
        assertTrue(stringUtil.isPositiveNumber("0.1"));
    }

    @Test
    void test_isPositiveNumber_false() {
       assertFalse(stringUtil.isPositiveNumber("0"));
       assertFalse(stringUtil.isPositiveNumber("-2"));
       assertFalse(stringUtil.isPositiveNumber("A"));
       assertFalse(stringUtil.isPositiveNumber(""));
       assertFalse(stringUtil.isPositiveNumber("я"));
       assertFalse(stringUtil.isPositiveNumber("("));
    }
}
