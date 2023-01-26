package assortedTutorials;

import java.util.Scanner;

public class CSwitchStatements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("This is a Date Formatter, Welcome!");
        int monthNumber;

        do {
            System.out.print("Please input month Number: ");
            monthNumber = scanner.nextInt();
        } while (monthNumber < 1 || monthNumber >= 13);

        String monthName = switch (monthNumber) {
            case 1 -> "january";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "";
        };

        int date;

        do {
            System.out.print("Please input Date: ");
            date = scanner.nextInt();
        } while (date < 1 || date > 31);

        int year;
        do {
            System.out.print("Please input Year: ");
            year = scanner.nextInt();
        } while (year < 1200 || year >= 9999);

        System.out.print("This is the Date: " + monthName + " " + date + ", " + year);


    }
}

