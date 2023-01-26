package SDPT;

import java.util.Scanner;

public class ForEachLoop {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Who are you looking for? : ");
        String[] names = {"David", "Alenere", "James"};


        String x = scanner.nextLine();
        for (String name : names) {
            if (name.equalsIgnoreCase(x)) {
                System.out.println("We found you, " + name + "!");
            } else {
                System.out.println("We can't find who you are " +
                        "looking for : " + x);
            }
            break;
        }

        System.out.print("Who are you looking for? : ");
        int[] numbers = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        int sum = 0;

        for (int num : numbers) {
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
