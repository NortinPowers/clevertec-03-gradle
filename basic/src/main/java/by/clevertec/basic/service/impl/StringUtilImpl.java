package by.clevertec.basic.service.impl;

import static by.clevertec.basic.util.InputUtil.getPreparedString;

import by.clevertec.basic.service.StringUtil;

public class StringUtilImpl implements StringUtil {

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
