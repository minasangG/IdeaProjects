package SwayCalc;
import java.text.NumberFormat;

public class PrintReport {

    private final calculator calculator;
    private final NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();

    public PrintReport(calculator calculator) {
        this.calculator = calculator;
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("MONTHLY PAYMENT SCHEDULE");
        System.out.println("------------------------");
        System.out.println();
        for (double balance : calculator.loanBalance()) {
            String remainingBalance = currencyInstance.format(balance);
            System.out.println(remainingBalance);
        }
    }

    public void printMonthlyMortgage() {
        double monthlyMortgage = calculator.calculateMortgage();
        String monthlyDue = currencyInstance.format(monthlyMortgage);
        System.out.println("Your monthly payment is: " + monthlyDue + ".");
    }

}

