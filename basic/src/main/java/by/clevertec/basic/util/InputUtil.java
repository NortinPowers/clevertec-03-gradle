package by.clevertec.basic.util;

import java.util.Scanner;
import lombok.experimental.UtilityClass;

@UtilityClass
public class InputUtil {

    private static final Scanner SCANNER;
    private static final String PRESS_ENTER = " and press Enter:";

    static {
        SCANNER = new Scanner(System.in);
    }

    /**
     * The method reads a string value from the console.
     *
     * @param message String displayed message
     * @return String read value
     */
    public static String readStringFromConsole(String message) {
        System.out.println(message + PRESS_ENTER);
        return SCANNER.next();
    }

    /**
     * The method replace ',' to '.' for parse.
     *
     * @param str String input date
     * @return Updated string value
     */
    public static String getPreparedString(String str) {
        return str.replace(",", ".");

    }
}
