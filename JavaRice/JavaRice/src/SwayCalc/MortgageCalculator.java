package SwayCalc;

import static java.lang.Math.pow;

public class MortgageCalculator implements calculator {
    private static final byte MONTHS_IN_YEARS = 12;
    private static final byte PERCENT = 100;
    private final int principal;
    private final double annualInterest;
    private final int years;

    public MortgageCalculator(int principal, double annualInterest, int years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }
    @Override
    public double calculateMortgage() {
        double monthlyInterest = getMonthlyInterest();
        int months = getNumberOfPayments();
        double multiplier = pow((1 + monthlyInterest), months);
        double numerator = monthlyInterest * multiplier;
        double denominator = multiplier - 1;

        return principal * (numerator / denominator);
    }
    @Override
    public double calculateRemainingBalance(int remainingMonths) {
        double monthlyInterest = getMonthlyInterest();
        int numberOfPayments = getNumberOfPayments();
        double base = 1 + monthlyInterest;
        double loanBalance;

        loanBalance = principal * ((Math.pow(base, numberOfPayments) - Math.pow(base, remainingMonths)) /
                (Math.pow(base, numberOfPayments) - 1));

        return loanBalance;
    }

    @Override
    public double[] loanBalance() {
        double[] balances = new double[getNumberOfPayments()];
        for (int i = 1; i < balances.length; i++) {
            balances[i - 1] = calculateRemainingBalance(i);
        }
        return balances;
    }
    @Override
    public double getMonthlyInterest() {
        return (annualInterest / PERCENT) / MONTHS_IN_YEARS;
    }

    private int getNumberOfPayments() {
        return years * MONTHS_IN_YEARS;
    }

}

