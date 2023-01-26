package assortedTutorials;

import java.text.NumberFormat;
import java.util.Scanner;

public class CMCalc {

    public static void main(String[] args) {

        int principal;
        double annualInterestRate;
        byte periodInYears;
        final int percent = 100;
        final int monthsInAYear = 12;

        principal = (int) getAnnualInterestRate("Please enter the principal: ", 1000, 1_000_000);
        annualInterestRate = getAnnualInterestRate("Please enter the Annual Interest Rate: ",1, 100);
        periodInYears = (byte) getAnnualInterestRate("Please enter the period in years: ", 1, 30);

        double powerMortgage = Math.pow(1 + (annualInterestRate / percent),
                (periodInYears * monthsInAYear));

        double totalMortgage = (principal * (annualInterestRate / percent) * powerMortgage)
                / (powerMortgage - 1);

        String result = NumberFormat.getCurrencyInstance().format(totalMortgage);
        System.out.println(" ");
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.print("Monthly Payments: " + " " + totalMortgage);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("--------");

        float remainingLoadBalance = (float) ((principal *
                powerMortgage - (periodInYears * monthsInAYear - 1)) /
                (powerMortgage - 1));


        double getBalance = 0;
        System.out.println(getBalance);
    }

    private static double getAnnualInterestRate(String s, double min, double max) {
        double value;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(s);
            value = sc.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Please enter values between" +
                    min + "and" + max);
        }
        return value;
    }
}

