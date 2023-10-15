package by.clevertec.lesson.service.impl;

import static by.clevertec.lesson.util.InputUtils.getPreparedString;

import by.clevertec.lesson.service.StringUtils;

public class StringUtilsImpl implements StringUtils {

    /**
     * Implementation of the method return true when input data is a positive number.
     *
     * @param str String input date
     * @return boolean result
     */
    @Override
    public boolean isPositiveNumber(String str) {
        double number;
        try {
            number = Double.parseDouble(getPreparedString(str));
        } catch (Exception exception) {
            number = 0;
        }
        return number > 0;
    }
}
