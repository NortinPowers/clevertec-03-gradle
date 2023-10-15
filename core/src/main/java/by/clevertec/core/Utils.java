package by.clevertec.core;

import by.clevertec.lesson.service.StringUtils;
import by.clevertec.lesson.service.impl.StringUtilsImpl;

public class Utils {

    /**
     * The method return true when all input data is a positive number.
     *
     * @param str String input date
     * @return boolean result
     */
    public boolean isAllPositiveNumbers(String... str) {
        StringUtils stringUtils = new StringUtilsImpl();
        for (String inputValue : str) {
            boolean isPositiveNumber = stringUtils.isPositiveNumber(inputValue);
            if (!isPositiveNumber) {
                return false;
            }
        }
        return true;
    }
}
