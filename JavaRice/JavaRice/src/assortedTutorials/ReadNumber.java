package assortedTutorials;

import java.util.Scanner;

public class ReadNumber {

    public static void readNumber(int ageValue) {
        Scanner scanner = new Scanner(System.in);
        ageValue = scanner.nextInt();
        if (ageValue >= 18) {
            System.out.println("You have access!");
        } else if (ageValue >=13) {
            System.out.println("You need consent!");
        } else {
            System.out.println("You don't have access!");
        }
    }
    public static void introduceSelf(String name, int ageValue) {
        System.out.println("This is my name: " + name + "and my" +
                "age is: " + ageValue);
    }
}





