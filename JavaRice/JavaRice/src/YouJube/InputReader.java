package YouJube;

import java.util.Scanner;

public class InputReader {

    private String firstName;
    private String lastName;
    private static final Scanner scanner = new Scanner(System.in);
    public static String readText(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int readNumber(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

//    public static readText(String prompt) {
//        return prompt;
//    }
//
//    public static readUserInput(String prompt) {
//        return prompt;
//    }
//
//    public static ultimateDeveloper(String prompt) {
//        //Sway, Clark, Rov
//        return prompt;

}
