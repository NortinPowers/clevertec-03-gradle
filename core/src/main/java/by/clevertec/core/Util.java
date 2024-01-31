package by.clevertec.core;

import by.clevertec.basic.service.StringUtil;
import by.clevertec.basic.service.impl.StringUtilImpl;

public class Util {

    /**
     * The method return true when all input data is a positive number.
     *
     * @param str String input date
     * @return boolean result
     */
    public boolean isAllPositiveNumbers(String... str) {
        StringUtil stringUtils = new StringUtilImpl();
        for (String inputValue : str) {
            boolean isPositiveNumber = stringUtils.isPositiveNumber(inputValue);
            if (!isPositiveNumber) {
                return false;
            }
        }
        return true;
    }
}
