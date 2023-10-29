package by.clevertec.basic;

import static by.clevertec.basic.util.InputUtil.readStringFromConsole;

import by.clevertec.basic.service.StringUtil;
import by.clevertec.basic.service.impl.StringUtilImpl;

public class Main {

    public static void main(String[] args) {
        StringUtil stringUtil = new StringUtilImpl();
        boolean isPositiveNumber = stringUtil.isPositiveNumber(readStringFromConsole("Enter the number"));
        if (isPositiveNumber) {
            System.out.println("The entered value is a positive number");
        } else {
            System.out.println("The entered value is not a positive number");
        }
    }
}
