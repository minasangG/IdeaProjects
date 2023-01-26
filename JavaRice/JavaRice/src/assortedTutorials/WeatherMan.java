package assortedTutorials;

import java.util.Scanner;

public class WeatherMan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input your first number: ");

        var firstUserInput = scanner.nextInt();
        if (firstUserInput < 0) {
            System.out.println("Please enter a positive number");
        } else System.out.println(" ");

        System.out.print("Please input your first number: ");
        var secondUserInput = scanner.nextInt();
        if (secondUserInput < 0) {
            System.out.println("Please enter a positive number");
        } else {
            System.out.println(" ");
        }
            System.out.println("This is your sum: " + (firstUserInput + secondUserInput));
    }

}
