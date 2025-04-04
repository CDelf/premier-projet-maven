package dev;

/**
 * Hello world!
 */
import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            String asciiArt = FigletFont.convertOneLine("Hello World!");
            System.out.println(asciiArt);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
