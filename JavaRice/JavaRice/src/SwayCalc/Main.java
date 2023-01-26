package SwayCalc;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        int principal = (int) ReadNumber.readNumber("Please enter principal amount: ", 1000, 1_000_000);
        double annualInterest = ReadNumber.readNumber("Please enter the Annual Interest: ", 1, 30);
        int years = (int) ReadNumber.readNumber("Please enter the payment period (years): ", 1, 100);

        var calculator = new MortgageCalculator(principal, annualInterest, years);
        var report = new PrintReport(calculator);

        report.printMonthlyMortgage();
        report.printPaymentSchedule();

    }
}

