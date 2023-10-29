package by.clevertec.api.util;

import java.util.Scanner;
import lombok.experimental.UtilityClass;

@UtilityClass
public class InputUtils {

    private static final Scanner SCANNER;
    private static final String PRESS_ENTER = " and press Enter:";

    static {
        SCANNER = new Scanner(System.in);
    }

    /**
     * The method reads a string values from the console.
     *
     * @param message String displayed message
     * @return String read values
     */
    public static String readStringLineFromConsole(String message) {
        System.out.println(message + PRESS_ENTER);
        return SCANNER.nextLine();
    }

    /**
     * The method splits the string value from the console into values separated by the symbol ",".
     *
     * @param str String input data
     * @return String[] result
     */
    public static String[] splitData(String str) {
        return str.split(",");
    }

    public static void showResult(boolean isAllPositiveNumbers) {
        if (isAllPositiveNumbers) {
            System.out.println("All entered numbers is a positive numbers");
        } else {
            System.out.println("Among the entered values, not all are positive digits");
        }
    }
}
