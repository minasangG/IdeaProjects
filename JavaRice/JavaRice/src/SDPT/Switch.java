package SDPT;

import java.util.List;
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        final String Clark = "CLARK";
        final String Sway = "SWAY";
        final String Prins = "PRINS";
        final String month;

        int[] userExams = {90, 91, 92, 95};

        System.out.print("What are you looking for? : ");
        String userGrade = scanner.nextLine();

        switch (userGrade) {
            case Clark -> System.out.println("Perfect, your grade is: " + userExams[0]);
            case Sway -> System.out.println("How is this possible, your grade is: " + userExams[1]);
            case Prins -> System.out.println("Is this the real life, your grade is: " + userExams[2]);
            default -> System.out.println("You are great, your grade is: "+ userExams[3]);
        }

    }
}
