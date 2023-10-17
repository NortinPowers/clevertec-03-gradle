package by.clevertec.api;

import static by.clevertec.api.util.InputUtils.readStringLineFromConsole;
import static by.clevertec.api.util.InputUtils.showResult;
import static by.clevertec.api.util.InputUtils.splitData;

import by.clevertec.core.Util;

public class App {

    public static void main(String[] args) {
        Util util = new Util();

        boolean isAllPositiveNumbers = util.isAllPositiveNumbers("12", "79");
        showResult(isAllPositiveNumbers);

        boolean isAllPositiveInputNumbers = util.isAllPositiveNumbers(splitData(readStringLineFromConsole("Enter comma-separated numbers")));
        showResult(isAllPositiveInputNumbers);
    }
}
