package game.errors;

import java.io.FileNotFoundException;

/**
 * Created by sergey on 03.05.2015.
 */
public class ErrorHandler {
    public static void handle(FileNotFoundException ex) {
        System.err.println("GAME ERROR: File can't be loaded, because it doesn't exists!");
    }

    public static void handle(NumberFormatException ex) {
        System.err.println("GAME CORE ERROR: Invalid parse from string to integer!");
    }
}
