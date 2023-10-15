package by.clevertec.api;

import static by.clevertec.api.util.InputUtils.readStringLineFromConsole;
import static by.clevertec.api.util.InputUtils.showResult;
import static by.clevertec.api.util.InputUtils.splitData;

import by.clevertec.core.Utils;

public class App {

    public static void main(String[] args) {
        Utils utils = new Utils();

        boolean isAllPositiveNumbers = utils.isAllPositiveNumbers("12", "79");
        showResult(isAllPositiveNumbers);

        boolean isAllPositiveInputNumbers = utils.isAllPositiveNumbers(splitData(readStringLineFromConsole("Enter comma-separated numbers")));
        showResult(isAllPositiveInputNumbers);
    }
}
