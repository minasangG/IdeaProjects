package assortedTutorials;

import java.util.Scanner;

import static SDPT.ForEachLoop.scanner;

public class ReadNumber {
    static Scanner scanner = new Scanner(System.in);
    public static void readNumber(int ageValue) {

        ageValue = scanner.nextInt();
        if (ageValue >= 18) {
            System.out.println("You have access!");
        } else if (ageValue >=13) {
            System.out.println("You need consent!");
        } else {
            System.out.println("You don't have access!");
        }
    }
    public static void introduceSelf() {
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter your age: ");
        int ageValue = scanner.nextInt();
        System.out.println("This is my name: " + name + "and my" +
                "age is: " + ageValue);
    }
}





