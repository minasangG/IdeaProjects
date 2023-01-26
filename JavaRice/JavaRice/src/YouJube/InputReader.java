package YouJube;

import java.util.Scanner;

public class InputReader {

    private static final Scanner scanner = new Scanner(System.in);
    public static String readText(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int readNumber(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
}