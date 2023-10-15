package by.clevertec.lesson;

import static by.clevertec.lesson.util.InputUtils.readStringFromConsole;

import by.clevertec.lesson.service.StringUtils;
import by.clevertec.lesson.service.impl.StringUtilsImpl;

public class Main {

    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtilsImpl();
        boolean isPositiveNumber = stringUtils.isPositiveNumber(readStringFromConsole("Enter the number"));
        if (isPositiveNumber) {
            System.out.println("The entered value is a positive number");
        } else {
            System.out.println("The entered value is not a positive number");
        }
    }
}
