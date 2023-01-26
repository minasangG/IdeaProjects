package assortedTutorials;

import java.util.Scanner;

public class CJavaConstructor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.print("Please enter your name: ");
            name = scanner.nextLine();
        }
            System.out.print("Hello " + name + "!");
        }

    }



